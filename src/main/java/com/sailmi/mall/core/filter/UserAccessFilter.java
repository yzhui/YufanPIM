package com.sailmi.mall.core.filter;

import java.io.File;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sailmi.mall.core.security.support.SecurityUserHolder;
import com.sailmi.mall.core.tools.CommUtil;
import com.sailmi.mall.core.tools.MobileCheckUtil;
import com.sailmi.mall.foundation.domain.SysConfig;
import com.sailmi.mall.foundation.domain.User;
import com.sailmi.mall.foundation.service.ISysConfigService;

@Component
public class UserAccessFilter implements Filter {

	@Autowired
	private ISysConfigService configService;

	public void destroy() {
	}

	public void doFilter( ServletRequest req, ServletResponse res, FilterChain chain ) throws IOException, ServletException {
		SysConfig config = this.configService.getSysConfig();
		HttpServletResponse response = (HttpServletResponse)res;
		HttpServletRequest request = (HttpServletRequest)req;
		System.out.println("request string:"+req.getAttributeNames());
		boolean isMobile=false;
		if(MobileCheckUtil.check(request.getHeader("USER-AGENT"))){
			isMobile=true;
		}
		String url = request.getRequestURI();
		boolean redirect = false;
		String redirect_url = "";
		String path = request.getSession().getServletContext().getRealPath( "/" ) + "install.lock";
		File file = new File( path );
		if( file.exists() ) {
			if( !config.isWebsiteState() ) {
				if( init_url( url ) ) {
					if( (url.indexOf( "/admin" ) < 0) && (url.indexOf( "/install.htm" ) <= 0) ) {
						redirect = true;
						redirect_url = CommUtil.getURL( request ) + "/close.htm";
					}
					if( url.indexOf( "/login.htm" ) >= 0 ) {
						redirect = false;
						if(isMobile){
							redirect = true;
							redirect_url = CommUtil.getURL( request ) + "/mobile/login.htm";
						}
					}
					if( url.indexOf( "close.htm" ) >= 0 ) {
						redirect = false;
					}
					if( url.indexOf( "/resources/" ) >= 0 ) {
						redirect = false;
					}
					if( url.indexOf( "js.htm" ) >= 0 ) {
						redirect = false;
					}
					if( url.indexOf( "/logout_success.htm" ) >= 0 ) {
						redirect = false;
					}
					if( url.indexOf( "/verify.htm" ) >= 0 ) {
						redirect = false;
					}
					if( url.indexOf( "/login_success.htm" ) >= 0 ) {
						redirect = false;
					}
					if( url.indexOf( "/install.htm" ) >= 0 ) {
						redirect = true;
						redirect_url = CommUtil.getURL( request ) + "/install_over.htm";
					}
					if( url.indexOf( "/install_over.htm" ) >= 0 )
						redirect = false;
				}
			}
			else {
				User user = SecurityUserHolder.getCurrentUser();
				if( user != null ) {
					if( url.indexOf( "/login.htm" ) >= 0 ) {
						redirect = true;
						redirect_url = CommUtil.getURL( request ) + "/index.htm";
						if(isMobile){
							redirect_url = CommUtil.getURL( request ) + "/mobile/index.htm";
						}
					}
					if( url.indexOf( "/register.htm" ) >= 0 ) {
						redirect = true;
						redirect_url = CommUtil.getURL( request ) + "/index.htm";
						if(isMobile){
							redirect_url = CommUtil.getURL( request ) + "/mobile/index.htm";
						}
					}
				}
				else if( url.indexOf( "/install" ) < 0 ) {
					redirect = false;
				}
				else {
					redirect_url = CommUtil.getURL( request ) + "/index.htm";
					if(isMobile){
						redirect_url = CommUtil.getURL( request ) + "/mobile/index.htm";
					}
					redirect = true;
				}
			}

		}
		else if( init_url( url ) ) {
			redirect_url = CommUtil.getURL( request ) + "/install.htm";
			redirect = true;
			if( url.indexOf( "/install" ) >= 0 ) {
				redirect = false;
			}
		}

		if( redirect )
			response.sendRedirect( redirect_url );
		else
			chain.doFilter( req, res );
	}

	public void init( FilterConfig config ) throws ServletException {
	}

	private boolean init_url( String url ) {
		String prifix = "";
		if( url.indexOf( "." ) > 0 )
			prifix = url.substring( url.lastIndexOf( "." ) + 1 );
		else {
			prifix = url;
		}
		String[] extend_list = { "css", "jpg", "jpeg", "png", "gif", "bmp", "js" };
		String[] servlet_list = { "/image/upload" };
		boolean flag = true;
		for( String temp : extend_list ) {
			if( temp.equals( prifix ) ) {
				flag = false;
			}
		}
		for( String temp : servlet_list ) {
			if( prifix.indexOf( temp ) >= 0 ) {
				flag = false;
			}
		}

		return flag;
	}
}
 package com.sailmi.sailplat.foundation.domain.query;
 
 import org.springframework.web.servlet.ModelAndView;

import com.sailmi.database.query.QueryObject;
 
 public class CommonGoodsClassQueryObject extends QueryObject
 {
   public CommonGoodsClassQueryObject(String currentPage, ModelAndView mv, String orderBy, String orderType)
   {
     super(currentPage, mv, orderBy, orderType);
   }
 
   public CommonGoodsClassQueryObject()
   {
   }
 }



 
 
 package com.sailmi.sailplat.foundation.domain.query;
 
 import org.springframework.web.servlet.ModelAndView;

import com.sailmi.database.query.QueryObject;
 
 public class GroupAreaQueryObject extends QueryObject
 {
   public GroupAreaQueryObject(String currentPage, ModelAndView mv, String orderBy, String orderType)
   {
     super(currentPage, mv, orderBy, orderType);
   }
 
   public GroupAreaQueryObject()
   {
   }
 }



 
 
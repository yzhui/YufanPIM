 package com.sailmi.mall.foundation.domain.query;
 
 import org.springframework.web.servlet.ModelAndView;

import com.sailmi.mall.core.query.QueryObject;
 
 public class StoreGradeLogQueryObject extends QueryObject
 {
   public StoreGradeLogQueryObject(String currentPage, ModelAndView mv, String orderBy, String orderType)
   {
     super(currentPage, mv, orderBy, orderType);
   }
 
   public StoreGradeLogQueryObject()
   {
   }
 }



 
 
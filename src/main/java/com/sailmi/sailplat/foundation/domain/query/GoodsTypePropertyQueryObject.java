 package com.sailmi.sailplat.foundation.domain.query;
 
 import org.springframework.web.servlet.ModelAndView;

import com.sailmi.database.query.QueryObject;
 
 public class GoodsTypePropertyQueryObject extends QueryObject
 {
   public GoodsTypePropertyQueryObject(String currentPage, ModelAndView mv, String orderBy, String orderType)
   {
     super(currentPage, mv, orderBy, orderType);
   }
 
   public GoodsTypePropertyQueryObject()
   {
   }
 }



 
 
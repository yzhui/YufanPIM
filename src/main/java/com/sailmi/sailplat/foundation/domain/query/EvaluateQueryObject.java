 package com.sailmi.sailplat.foundation.domain.query;
 
 import org.springframework.web.servlet.ModelAndView;

import com.sailmi.sailplat.core.query.QueryObject;
 
 public class EvaluateQueryObject extends QueryObject
 {
   public EvaluateQueryObject(String currentPage, ModelAndView mv, String orderBy, String orderType)
   {
     super(currentPage, mv, orderBy, orderType);
   }
 
   public EvaluateQueryObject()
   {
   }
 }



 
 
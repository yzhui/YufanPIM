 package com.sailmi.sailplat.foundation.domain.query;
 
 import org.springframework.web.servlet.ModelAndView;

import com.sailmi.sailplat.core.query.QueryObject;
 
 public class ComplaintSubjectQueryObject extends QueryObject
 {
   public ComplaintSubjectQueryObject(String currentPage, ModelAndView mv, String orderBy, String orderType)
   {
     super(currentPage, mv, orderBy, orderType);
   }
 
   public ComplaintSubjectQueryObject()
   {
   }
 }



 
 
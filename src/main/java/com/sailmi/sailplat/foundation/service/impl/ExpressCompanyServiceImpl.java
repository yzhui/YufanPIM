 package com.sailmi.sailplat.foundation.service.impl;
 
 import com.sailmi.sailplat.core.dao.IGenericDAO;
import com.sailmi.sailplat.core.query.GenericPageList;
import com.sailmi.sailplat.core.query.PageObject;
import com.sailmi.sailplat.core.query.support.IPageList;
import com.sailmi.sailplat.core.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.ExpressCompany;
import com.sailmi.sailplat.foundation.service.IExpressCompanyService;

import java.io.Serializable;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 
 @Service
 @Transactional
 public class ExpressCompanyServiceImpl
   implements IExpressCompanyService
 {
 
   @Resource(name="expressCompanyDAO")
   private IGenericDAO<ExpressCompany> expressCompanyDao;
 
   public boolean save(ExpressCompany expressCompany)
   {
     try
     {
       this.expressCompanyDao.save(expressCompany);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public ExpressCompany getObjById(Long id)
   {
     ExpressCompany expressCompany = (ExpressCompany)this.expressCompanyDao.get(id);
     if (expressCompany != null) {
       return expressCompany;
     }
     return null;
   }
 
   public boolean delete(Long id) {
     try {
       this.expressCompanyDao.remove(id);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public boolean batchDelete(List<Serializable> expressCompanyIds)
   {
     for (Serializable id : expressCompanyIds) {
       delete((Long)id);
     }
     return true;
   }
 
   public IPageList list(IQueryObject properties) {
     if (properties == null) {
       return null;
     }
     String query = properties.getQuery();
     Map params = properties.getParameters();
     GenericPageList pList = new GenericPageList(ExpressCompany.class, query, 
       params, this.expressCompanyDao);
     if (properties != null) {
       PageObject pageObj = properties.getPageObj();
       if (pageObj != null)
         pList.doList(pageObj.getCurrentPage() == null ? 0 : pageObj
           .getCurrentPage().intValue(), pageObj.getPageSize() == null ? 0 : 
           pageObj.getPageSize().intValue());
     } else {
       pList.doList(0, -1);
     }return pList;
   }
 
   public boolean update(ExpressCompany expressCompany) {
     try {
       this.expressCompanyDao.update(expressCompany);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public List<ExpressCompany> query(String query, Map params, int begin, int max) {
     return this.expressCompanyDao.query(query, params, begin, max);
   }
 }



 
 
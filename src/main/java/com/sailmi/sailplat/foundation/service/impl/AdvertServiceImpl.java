 package com.sailmi.sailplat.foundation.service.impl;
 
 import com.sailmi.database.dao.IGenericDAO;
import com.sailmi.database.query.GenericPageList;
import com.sailmi.database.query.PageObject;
import com.sailmi.database.query.support.IPageList;
import com.sailmi.database.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.Advert;
import com.sailmi.sailplat.foundation.service.IAdvertService;

import java.io.Serializable;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 
 @Service
 @Transactional
 public class AdvertServiceImpl
   implements IAdvertService
 {
 
   @Resource(name="advertDAO")
   private IGenericDAO<Advert> advertDao;
 
   public boolean save(Advert advert)
   {
     try
     {
       this.advertDao.save(advert);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public Advert getObjById(Long id)
   {
     Advert advert = (Advert)this.advertDao.get(id);
     if (advert != null) {
       return advert;
     }
     return null;
   }
 
   public boolean delete(Long id) {
     try {
       this.advertDao.remove(id);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public boolean batchDelete(List<Serializable> advertIds)
   {
     for (Serializable id : advertIds) {
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
     GenericPageList pList = new GenericPageList(Advert.class, query, 
       params, this.advertDao);
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
 
   public boolean update(Advert advert) {
     try {
       this.advertDao.update(advert);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public List<Advert> query(String query, Map params, int begin, int max) {
     return this.advertDao.query(query, params, begin, max);
   }
 }



 
 
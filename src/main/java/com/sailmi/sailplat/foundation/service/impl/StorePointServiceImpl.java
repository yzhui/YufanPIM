 package com.sailmi.sailplat.foundation.service.impl;
 
 import com.sailmi.database.dao.IGenericDAO;
import com.sailmi.database.query.GenericPageList;
import com.sailmi.database.query.PageObject;
import com.sailmi.database.query.support.IPageList;
import com.sailmi.database.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.StorePoint;
import com.sailmi.sailplat.foundation.service.IStorePointService;

import java.io.Serializable;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 
 @Service
 @Transactional
 public class StorePointServiceImpl
   implements IStorePointService
 {
 
   @Resource(name="storePointDAO")
   private IGenericDAO<StorePoint> storePointDao;
 
   public boolean save(StorePoint storePoint)
   {
     try
     {
       this.storePointDao.save(storePoint);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public StorePoint getObjById(Long id)
   {
     StorePoint storePoint = (StorePoint)this.storePointDao.get(id);
     if (storePoint != null) {
       return storePoint;
     }
     return null;
   }
 
   public boolean delete(Long id) {
     try {
       this.storePointDao.remove(id);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public boolean batchDelete(List<Serializable> storePointIds)
   {
     for (Serializable id : storePointIds) {
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
     GenericPageList pList = new GenericPageList(StorePoint.class, query, 
       params, this.storePointDao);
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
 
   public boolean update(StorePoint storePoint) {
     try {
       this.storePointDao.update(storePoint);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public List<StorePoint> query(String query, Map params, int begin, int max) {
     return this.storePointDao.query(query, params, begin, max);
   }
 }



 
 
 package com.sailmi.sailplat.foundation.service.impl;
 
 import com.sailmi.sailplat.core.dao.IGenericDAO;
import com.sailmi.sailplat.core.query.GenericPageList;
import com.sailmi.sailplat.core.query.PageObject;
import com.sailmi.sailplat.core.query.support.IPageList;
import com.sailmi.sailplat.core.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.Address;
import com.sailmi.sailplat.foundation.service.IAddressService;

import java.io.Serializable;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 
 @Service
 @Transactional
 public class AddressServiceImpl
   implements IAddressService
 {
 
   @Resource(name="addressDAO")
   private IGenericDAO<Address> addressDao;
 
   public boolean save(Address address)
   {
     try
     {
    	System.out.println("88888888888888888888888888888  address id is:"+address.getId());
       this.addressDao.save(address);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public Address getObjById(Long id)
   {
     Address address = (Address)this.addressDao.get(id);
     if (address != null) {
       return address;
     }
     return null;
   }
 
   public boolean delete(Long id) {
     try {
       this.addressDao.remove(id);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public boolean batchDelete(List<Serializable> addressIds)
   {
     for (Serializable id : addressIds) {
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
     GenericPageList pList = new GenericPageList(Address.class, query, 
       params, this.addressDao);
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
 
   public boolean update(Address address) {
     try {
       this.addressDao.update(address);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public List<Address> query(String query, Map params, int begin, int max) {
     return this.addressDao.query(query, params, begin, max);
   }
 }



 
 
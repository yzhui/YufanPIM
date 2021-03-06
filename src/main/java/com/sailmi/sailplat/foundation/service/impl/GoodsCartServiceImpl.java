 package com.sailmi.sailplat.foundation.service.impl;
 
 import com.sailmi.database.dao.IGenericDAO;
import com.sailmi.database.query.GenericPageList;
import com.sailmi.database.query.PageObject;
import com.sailmi.database.query.support.IPageList;
import com.sailmi.database.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.GoodsCart;
import com.sailmi.sailplat.foundation.service.IGoodsCartService;

import java.io.Serializable;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 
 @Service
 @Transactional
 public class GoodsCartServiceImpl
   implements IGoodsCartService
 {
 
   @Resource(name="goodsCartDAO")
   private IGenericDAO<GoodsCart> goodsCartDao;
 
   public boolean save(GoodsCart goodsCart)
   {
     try
     {
       goodsCart.setId(null);
       this.goodsCartDao.save(goodsCart);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public GoodsCart getObjById(Long id)
   {
     GoodsCart goodsCart = (GoodsCart)this.goodsCartDao.get(id);
     if (goodsCart != null) {
       return goodsCart;
     }
     return null;
   }
 
   public boolean delete(Long id) {
     try {
       this.goodsCartDao.remove(id);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public boolean batchDelete(List<Serializable> goodsCartIds)
   {
     for (Serializable id : goodsCartIds) {
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
     GenericPageList pList = new GenericPageList(GoodsCart.class, query, 
       params, this.goodsCartDao);
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
 
   public boolean update(GoodsCart goodsCart) {
     try {
       this.goodsCartDao.update(goodsCart);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public List<GoodsCart> query(String query, Map params, int begin, int max) {
     return this.goodsCartDao.query(query, params, begin, max);
   }
 }



 
 
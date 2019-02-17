 package com.sailmi.sailplat.foundation.service.impl;
 
 import com.sailmi.database.dao.IGenericDAO;
import com.sailmi.database.query.GenericPageList;
import com.sailmi.database.query.PageObject;
import com.sailmi.database.query.support.IPageList;
import com.sailmi.database.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.Template;
import com.sailmi.sailplat.foundation.service.ITemplateService;

import java.io.Serializable;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 
 @Service
 @Transactional
 public class TemplateServiceImpl
   implements ITemplateService
 {
 
   @Resource(name="templateDAO")
   private IGenericDAO<Template> templateDao;
 
   public boolean save(Template template)
   {
     try
     {
       this.templateDao.save(template);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public Template getObjById(Long id)
   {
     Template template = (Template)this.templateDao.get(id);
     if (template != null) {
       return template;
     }
     return null;
   }
 
   public boolean delete(Long id) {
     try {
       this.templateDao.remove(id);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public boolean batchDelete(List<Serializable> templateIds)
   {
     for (Serializable id : templateIds) {
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
     GenericPageList pList = new GenericPageList(Template.class, query, 
       params, this.templateDao);
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
 
   public boolean update(Template template) {
     try {
       this.templateDao.update(template);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public List<Template> query(String query, Map params, int begin, int max) {
     return this.templateDao.query(query, params, begin, max);
   }
 
   public Template getObjByProperty(String propertyName, Object value)
   {
     return (Template)this.templateDao.getBy(propertyName, value);
   }
 }



 
 
package com.sailmi.mall.foundation.service;

import com.sailmi.mall.core.query.support.IPageList;
import com.sailmi.mall.core.query.support.IQueryObject;
import com.sailmi.mall.foundation.domain.ArticleClass;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IArticleClassService
{
  public abstract boolean save(ArticleClass paramArticleClass);

  public abstract ArticleClass getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(ArticleClass paramArticleClass);

  public abstract List<ArticleClass> query(String paramString, Map paramMap, int paramInt1, int paramInt2);

  public abstract ArticleClass getObjByPropertyName(String paramString, Object paramObject);
}



 
 
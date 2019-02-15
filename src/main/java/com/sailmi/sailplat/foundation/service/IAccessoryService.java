package com.sailmi.sailplat.foundation.service;

import com.sailmi.sailplat.core.query.support.IPageList;
import com.sailmi.sailplat.core.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.Accessory;

import java.util.List;
import java.util.Map;

public abstract interface IAccessoryService
{
  public abstract boolean save(Accessory paramAccessory);

  public abstract boolean delete(Long paramLong);

  public abstract boolean update(Accessory paramAccessory);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract Accessory getObjById(Long paramLong);

  public abstract Accessory getObjByProperty(String paramString1, String paramString2);

  public abstract List<Accessory> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



 
 
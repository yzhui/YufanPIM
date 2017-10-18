package com.sailmi.mall.foundation.service;

import com.sailmi.mall.core.query.support.IPageList;
import com.sailmi.mall.core.query.support.IQueryObject;
import com.sailmi.mall.foundation.domain.Coupon;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface ICouponService
{
  public abstract boolean save(Coupon paramCoupon);

  public abstract Coupon getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(Coupon paramCoupon);

  public abstract List<Coupon> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



 
 
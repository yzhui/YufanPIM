package com.sailmi.sailplat.foundation.service;

import com.sailmi.database.query.support.IPageList;
import com.sailmi.database.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.Chatting;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IChattingService
{
  public abstract boolean save(Chatting paramChatting);

  public abstract Chatting getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(Chatting paramChatting);

  public abstract List<Chatting> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



 
 
 package com.sailmi.sailplat.view.web.tools;
 
 import com.sailmi.sailplat.foundation.domain.Accessory;
import com.sailmi.sailplat.foundation.service.IAccessoryService;
import com.sailmi.sailplat.foundation.service.IAlbumService;
import com.sailmi.tools.CommUtil;

import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
 
 @Component
 @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
 public class AlbumViewTools
 {
 
   @Autowired
   private IAlbumService albumService;
 
   @Autowired
   private IAccessoryService accessoryService;
 
   public List<Accessory> query_album(String id)
   {
     List list = new ArrayList();
     if ((id != null) && (!id.equals(""))) {
       Map params = new HashMap();
       params.put("album_id", CommUtil.null2Long(id));
       list = this.accessoryService
         .query(
         "select obj from Accessory obj where obj.album.id=:album_id", 
         params, -1, -1);
     } else {
       list = this.accessoryService.query(
         "select obj from Accessory obj where obj.album.id is null", 
         null, -1, -1);
     }
     return list;
   }
 }


 
 
 
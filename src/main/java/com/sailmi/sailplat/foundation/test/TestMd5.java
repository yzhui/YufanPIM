 package com.sailmi.sailplat.foundation.test;
 
 import java.io.PrintStream;

import com.sailmi.sailplat.uc.api.UCClient;
 
 public class TestMd5
 {
   public static void main(String[] args)
   {
     String s = "admin1";
 
     UCClient client = new UCClient();
     System.out.println(client.uc_authcode("admin1", "ECODE"));
     String s1 = client.uc_authcode("9d11637dd94f7290e9d2d5fa7350f82b", "DECODE", "123456");
     System.out.println(s1);
   }
 }



 
 
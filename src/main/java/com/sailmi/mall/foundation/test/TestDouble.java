 package com.sailmi.mall.foundation.test;
 
 import com.sailmi.mall.core.tools.CommUtil;
 import java.io.PrintStream;
 
 public class TestDouble
 {
   public static void main(String[] args)
   {
     float a = 290.0F;
     float b = 211.39999F;
     System.out.println(CommUtil.subtract(Double.valueOf(a), Double.valueOf(b)));
   }
 }



 
 
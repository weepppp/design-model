package com.tang.structuralmode.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author weepppp 2022/7/14 8:27
 **/
public class FlyweightFactory {
     private static Map map = new HashMap();

     public static Flyweight getFlyweight(String key){
         if (map.get(key) == null){
             map.put(key,new FlyweightImpl());
         }
         return (Flyweight) map.get(key);
     }

     public static int getSize(){
         return map.size();
     }
}

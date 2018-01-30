package com.rg.Tools;

import java.lang.reflect.Field;
import java.util.Map;

import org.springframework.cglib.beans.BeanMap;



/**
 * Map类型转化为bean工具类
 * @author Zhou
 *
 */
public class MapToBean {

	  public static <T> T mapToBean(T obj,Map<String,String> map) throws IllegalArgumentException, IllegalAccessException{
		 
		  BeanMap beanMap = BeanMap.create(obj);
		  beanMap.putAll(map);
		   return obj;
	  }
}

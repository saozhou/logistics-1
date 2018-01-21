package com.rg.Tools;

import java.util.Map;

import com.alibaba.fastjson.JSON;

public class JsonMap {

	public static Map<String,String> JsonMap(String json){
		System.out.println(json);
		 Map<String,String>map = (Map<String,String>)JSON.parse(json);
		return map;
		
	}
}

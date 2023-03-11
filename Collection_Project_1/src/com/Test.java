package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Map<String, Double> map=new LinkedHashMap<String, Double>(); 
		map.put("tom", 2.8);
		
		Set<String>keys=map.keySet();
		for(String key: keys) {
			System.out.println("salary of "+key+" is "+map.get(key)+"LPA");
		}

	}

}

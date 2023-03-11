package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		Map<Integer, String> map=new LinkedHashMap<Integer, String>();
		map.put(10, "A");
		map.put(20, "B");
		map.put(30, "C");
		
		
		Set<Integer> keys=map.keySet();
		for(int key : keys){
			System.out.println(key+" "+map.get(key));
			
		}
	}

}

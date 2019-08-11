package com.iotek.collection.map;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		TreeMap<String, String> tmap = new TreeMap<>();
		tmap.put("jack", "zhangsan");
		tmap.put("mary", "xiaohong");
		tmap.put("rose", "xiaozhang");
		tmap.put("free", "xiaoming");
		tmap.put("rose", "chenhao");
		System.out.println(tmap);
		Set<Entry<String, String>> entrySet = tmap.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
	}

}

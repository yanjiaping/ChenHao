package com.iotek.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("jay", "张三");
		map.put("jay", "李四");
		map.put("rose", "玫瑰");
		map.put("marry", "小红");
		System.out.println(map);
		// 获取map中所有的键
		/*
		 * Set<String> keys = map.keySet(); for (String key : keys) {
		 * System.out.println(key); }
		 */

		// 获取map中所有的值
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println(value);
		}

		// 得到key的同时得到key所对应的值
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + "--" + map.get(key));
		}

		System.out.println(map.size());
		System.out.println(map.isEmpty());

		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
	}

}

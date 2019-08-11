package com.iotek.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("jay", "����");
		map.put("jay", "����");
		map.put("rose", "õ��");
		map.put("marry", "С��");
		System.out.println(map);
		// ��ȡmap�����еļ�
		/*
		 * Set<String> keys = map.keySet(); for (String key : keys) {
		 * System.out.println(key); }
		 */

		// ��ȡmap�����е�ֵ
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println(value);
		}

		// �õ�key��ͬʱ�õ�key����Ӧ��ֵ
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

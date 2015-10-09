package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 容器的打印
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月8日 下午12:11:25
 */
public class Test8 {
	public static void main(String[] args) {
		System.out.println(fill(new ArrayList<String>()));// List常见的实现类有两个，ArrayList擅长随机访问，不擅长在中间插入或删除元素（注：这里的“擅长”是效率问题，“不擅长”不代表“不可以”）
		System.out.println(fill(new LinkedList<String>()));// LinkedList擅长在中间添加或删除元素，不擅长随机访问
		System.out.println(fill(new HashSet<String>()));// Set常见的实现类有三个,HashSet可以最快地获取元素，元素保存的顺序与插入时的顺序无关
		System.out.println(fill(new TreeSet<String>()));// TreeSet按照元素升序排序后的顺序存储元素
		System.out.println("5:" + fill(new LinkedHashSet<String>()));// LinkedHashSet按照插入时的顺序存储元素
		System.out.println(fill(new HashMap<String, String>()));// Map的常见实现类有三个，HashMap可以最快地获取元素，没有按照任何明显的顺序存储元素
		System.out.println(fill(new TreeMap<String, String>()));// LinkedMap将key进行升序排序后存储元素
		System.out.println(fill(new LinkedHashMap<String, String>()));// LinkedHashMap按照插入的顺序保存元素
		System.out.println("集合打印的形式：[a1,a2,a3]，Map打印的形式：{k1=v1,k2=v2,k3=v3}");
	}

	public static Collection<String> fill(Collection<String> col) {
		col.add("abc");
		col.add("def");
		col.add("acg");
		col.add("abg");
		return col;
	}

	public static Map<String, String> fill(Map<String, String> map) {
		map.put("abc", "1");
		map.put("def", "2");
		map.put("acg", "3");
		map.put("abg", "4");
		return map;
	}
}

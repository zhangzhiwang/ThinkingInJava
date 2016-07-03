package com.asiainfo.chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 可变参数与泛型方法
 *
 * @author zhiwangzhang
 * @date 2016年7月3日 下午1:12:56
 */
public class Test29 {
	public static <T> List<T> m1(T... ts) {
		List<T> list = new ArrayList<T>();
		for (T t : ts) {
			list.add(t);
		}
		return list;
	}
	
	public static void m2(List<String> list) {}
	
	public static void main(String[] args) {
		List<Integer> l1 = Test29.m1(1,2,3);
		System.out.println(l1);
		List<Double> l2 = m1(1.1, 1.2,1.3);
		System.out.println(l2);
		List<String> l3 = m1("a","b","c");
		List<String> l4 = Test29.m1("a","b","c");//类似Arrays.asList()
		List<String> l5 = Test29.<String>m1("a","b","c");
		System.out.println(l3);
		
		m2(m1("a"));
		
		List<Integer> l6 = Arrays.asList(1,2,3);
		List<Integer> l7 = Arrays.<Integer>asList(1,2,3);
	}
}

package com.asiainfo.chapter15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 方法重载
 *
 * @author zhiwangzhang
 * @date 2016年7月3日 下午2:36:32
 */
public class Test31 {
	public static void m1(List<Integer> list) {
		System.out.println("List");
	}
	
	public static void m1(ArrayList<Integer> list) {
		System.out.println("ArrayList");
	}
	
	public static void m2(Test31 t) {
		System.out.println("Test31");
	}
	
	public static void m2(Test31_1 t) {
		System.out.println("Test31_1");
	}
	
	public static void main(String[] args) {
		m1(new ArrayList<Integer>());
		m1(new LinkedList<Integer>());
		
		m2(new Test31_1());
		m2(new Test31_2());
		m2(new Test31());
	}
}

class Test31_1 extends Test31 {}

class Test31_2 extends Test31 {}
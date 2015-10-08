package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * List
 * 
 * @author zhangzhiwang
 * @date 2015年10月8日 下午10:23:43
 */
public class Test11 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		Integer i1 = new Integer(3);
		list1.add(i1);
		System.out.println("1:" + list1);
		System.out.println("2:" + list1.contains(i1));
		list1.remove(i1);
		System.out.println("3:" + list1);
		System.out.println("4:" + list1.indexOf(2));
		System.out.println("5:" + list1.indexOf(3));
		System.out.println("6:" + list1.remove(i1));
	}
}

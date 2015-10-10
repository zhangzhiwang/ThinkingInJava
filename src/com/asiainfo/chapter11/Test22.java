package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * List的remove()方法抛出的异常——java.util.ConcurrentModificationException
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月10日 下午12:58:46
 */
public class Test22 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		System.out.println(list);
		List<Integer> l = new ArrayList<Integer>();
		l.add(2);
		l.add(3);
		System.out.println(l);
		list.removeAll(l);
		System.out.println(list);
		System.out.println("-----------------");

//		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		System.out.println(list2);
		List<Integer> sub = list2.subList(1, 3);
		System.out.println(sub);
		list2.removeAll(sub);//java.util.ConcurrentModificationException
	}
}

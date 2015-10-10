package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * List和数组互相转换以及注意的问题
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月10日 上午9:25:17
 */
public class Test21 {
	public static void main(String[] args) {
		// 数组转List
		List<Integer> list1 = Arrays.asList(new Integer[]{1,2,3});
		// Arrays.asList()返回的是ArrayList，此ArrayList非java.util.ArrayList，它是Arrays类里面的私有静态内部类，他是固定长度的。它继承AbstractList，通过反编译打开AbstractList，看一下set方法、add方法、remove方法就知道了，而ArrayList并没有复写这些方法。另外，java.util.ArrayList也继承了AbstractList类，只不过它复写了add、remove等方法。
//		list1.add(4);// java.lang.UnsupportedOperationException
		// 要想避免此类问题，可以用如下方法：
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3}));
		list2.add(4);
		System.out.println(list2);
		
		// List转数组
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(1);
//		Integer[] i1 = (Integer[]) list3.toArray();//  java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.Integer;
		Integer[] i2 = list3.toArray(new Integer[0]);
		for (Integer i : i2) {
			System.out.println(i);
		}
	}
}

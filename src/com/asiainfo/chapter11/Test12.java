package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * List的remove()、indexOf()、contains()方法根据元素equals()的定义不同而不同
 * 
 * @author zhangzhiwang
 * @date 2015年10月8日 下午10:38:47
 */
public class Test12 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		Integer i3 = new Integer(3);
		list.add(i1);
		list.add(i2);
		list.add(i3);
		System.out.println(list);
		System.out.println(list.contains(i2));
		System.out.println(list.remove(i2));
		System.out.println(list.contains(i2));
		System.out.println(list);
		System.out.println("---");
		Integer i4 = new Integer(3);
		System.out.println(list);
		System.out.println(list.indexOf(i4));
		System.out.println(list.contains(i4));
		System.out.println("i4并没有加入到list中，为什么会出现上面的结果？是因为i3.equals(i4) = " + i3.equals(i4));// 本测试其他部分见Test13
	}
}

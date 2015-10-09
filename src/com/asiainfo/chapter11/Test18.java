package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * List的交集操作retainAll()根据元素equals()方法的定义不同而不同
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月9日 下午1:40:41
 */
public class Test18 {
	public static void main(String[] args) {
		List<Fruit> list1 = new ArrayList<Fruit>();
		list1.add(new Fruit(1,"apple"));
		list1.add(new Fruit(2,"orange"));
		System.out.println(list1);
		
		List<Fruit> list2 = new ArrayList<Fruit>();
		list2.add(new Fruit(3,"orange"));
		System.out.println(list2);
		
		list1.retainAll(list2);
		System.out.println(list1);
	}
}

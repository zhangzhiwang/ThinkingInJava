package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * List的可通过对象引用和索引移除元素
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月9日 下午1:51:10
 */
public class Test19 {
	public static void main(String[] args) {
		List<Fruit> list1 = new ArrayList<Fruit>();
		list1.add(new Fruit(1, "apple"));
		list1.add(new Fruit(2, "orange"));
		list1.add(new Fruit(3, "nut"));
		System.out.println(list1);
		
		Fruit f = new Fruit(2, "orange");
		list1.remove(f);
		System.out.println(list1);
		list1.remove(1);// 通过索引移除元素不用考虑元素的equals()方法
		System.out.println(list1);
	}
}

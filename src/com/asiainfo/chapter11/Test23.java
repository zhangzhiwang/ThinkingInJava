package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * List的removeAll()方法——依据元素的equals()的不同而不同
 * 
 * @author zhangzhiwang
 * @date 2015年10月11日 上午10:07:37
 */
public class Test23 {
	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit(1, "apple"));
		list.add(new Fruit(2, "orange"));
		list.add(new Fruit(3, "nut"));
		System.out.println(list);
		List<Fruit> list2 = new ArrayList<Fruit>();
		list2.add(new Fruit(4, "orange"));
		list2.add(new Fruit(5, "nut"));
		System.out.println(list2);
		System.out.println(list.removeAll(list2));
		System.out.println(list);// 可以改变com.asiainfo.chapter11.Fruit类的equals()来看运行结果
	}
}

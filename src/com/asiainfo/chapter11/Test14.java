package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * 将List中的某个元素取出来再将其移除是没有问题的
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月9日 下午1:07:10
 */
public class Test14 {
	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit(1, "apple"));
		list.add(new Fruit(2, "orange"));
		System.out.println(list);
		Fruit f = list.get(1);
		System.out.println(list.indexOf(f));
		System.out.println(list.remove(f));
		System.out.println(list);
	}
}

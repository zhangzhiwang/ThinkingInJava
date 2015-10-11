package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * List的其他一些方法
 * 
 * @author zhangzhiwang
 * @date 2015年10月11日 上午10:28:52
 */
public class Test24 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		list.set(1, 4);
		System.out.println(list);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(5);
		list2.add(6);
		list.addAll(list2);
		System.out.println(list);
		list.addAll(2,list2);
		System.out.println(list);
		
		System.out.println("-----------------------");
		Collection<Integer> col = new ArrayList<Integer>();
		col.add(1);
		col.add(2);
		col.add(3);
		System.out.println(col);
		col.addAll(list2);
		System.out.println(col);
//		col.add(1,list2);//Collection的add()方法没有重载形式，只能将参数Collection添加到末尾
		System.out.println("-----------------------");
		
		System.out.println(list.isEmpty());
		System.out.println(new ArrayList<Integer>().isEmpty());
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list = new ArrayList(Arrays.asList(1,2,3));
//		Integer[] i = (Integer[]) list.toArray();//java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.Integer; 无參toArray()方法返回的是一个Object[]，无法强制转换成具体类型数组，但可以在循环里面去转换。
		Object[] obj = list.toArray();
		for (Object o : obj) {
			Integer i = (Integer) o;
			System.out.println(i);
		}
		
		Integer[] ints = list.toArray(new Integer[0]);//有参数的toArray()方法，可以将List转换成参数类型的数组，参数不用考虑尺寸问题，toArray()方法会创建一个指定类型的合适的尺寸的数组来存放List的元素
		for (Integer i : ints) {
			System.out.println(i);
		}
	}
}

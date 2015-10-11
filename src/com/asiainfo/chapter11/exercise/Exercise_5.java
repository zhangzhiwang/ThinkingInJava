package com.asiainfo.chapter11.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * p255练习5 详见The_Thinking_in_Java_Annotated_Solution_Guide(TIJ4-solutions)
 * p183，这里主要是强调有关List<Integer>的问题
 * 
 * @author zhangzhiwang
 * @date 2015年10月11日 上午11:14:15
 */
public class Exercise_5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		System.out.println(list);
		list.remove(2);//remove(int index) 移除列表中指定位置的元素，即将索引为2的元素移除，而不是将值为2的元素移除
		System.out.println(list);
		list.remove(new Integer(2));//remove(Object o) 从此列表中移除第一次出现的指定元素（如果存在），注意这两个方法。元素类型为复合类型的时候不容易出现混淆
		System.out.println(list);

		System.out.println("-------------");
		List<String> list2 = new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "2"));
		System.out.println(list2);
		list2.remove(2);
		System.out.println(list2);
		list2.remove("2");
		System.out.println(list2);

	}
}

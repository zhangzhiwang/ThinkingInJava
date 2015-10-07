package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Collection.addAll()与Collections.addAll()，二者都可在集合中添加一组元素
 * 
 * @author zhangzhiwang
 * @date 2015年10月3日 下午4:24:21
 */
public class Test6 {
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		Collection<Integer> c2 = new ArrayList<Integer>(Arrays.asList(0));
		c2.addAll(c1);
		for (Integer i : c2) {
			System.out.println(i);
		}
		System.out.println("---");

		Collections.addAll(c2, 4, 5, 6);// 将可变参数列表的元素追加到指定Collection当中
		for (Integer i : c2) {
			System.out.println(i);
		}
	}
}

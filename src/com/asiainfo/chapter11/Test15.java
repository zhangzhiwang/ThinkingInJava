package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * List的add()方法
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月9日 下午1:14:20
 */
public class Test15 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		list.add(2,4);
		System.out.println(list);// 有关在ArrayList和LinkedList中间插入元素的问题，可以参考课本p225中间部分
	}
}

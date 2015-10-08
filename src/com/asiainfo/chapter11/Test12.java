package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * List的remove()方法
 * 
 * @author zhangzhiwang
 * @date 2015年10月8日 下午10:38:47
 */
public class Test12 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		System.out.println(list);
		String str1 = new String("b");
		System.out.println("2:" + list.indexOf(str1));
		System.out.println("3:" + list.remove(str1));
	}
}

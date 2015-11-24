package com.asiainfo.chapter11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Set集成自Collection，具有与Collection完全一样的方法，即没有添加自己的方法
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月24日 下午12:56:32
 */
public class Test42 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Collections.addAll(set1, "a b c".split(" "));
		System.out.println(set1);
		System.out.println("1:" + set1.contains("a"));
		System.out.println("2:" + set1.contains("d"));

		Set<String> set2 = new HashSet<String>();
		Collections.addAll(set2, "a", "b");
		System.out.println(set2);
		System.out.println("3:" + set1.containsAll(set2));
		set1.remove("a");
		System.out.println("4:" + set1.containsAll(set2));
		set1.removeAll(set2);
		System.out.println(set1);
	}
}

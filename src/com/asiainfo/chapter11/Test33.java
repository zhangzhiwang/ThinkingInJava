package com.asiainfo.chapter11;

import java.util.Set;
import java.util.TreeSet;
import net.mindview.util.*;

/**
 * TreeSet的构造方法之一——TreeSet(Comparator<? super E> comparator)，构造一个新的空
 * TreeSet，它根据指定比较器进行排序。
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月13日 下午1:28:39
 */
public class Test33 {
	public static void main(String[] args) {
		Set<String> set1 = new TreeSet<String>();
		set1.add("A");
		set1.add("Ab");
		set1.add("ab");
		System.out.println(set1);
		Set<String> set2 = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);//比较器将在第16章介绍
		set2.add("A");
		set2.add("Ab");
		set2.add("ab");
		System.out.println(set2);
	}
}

package com.asiainfo.chapter11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月13日 下午12:53:04
 */
public class Test31 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();//Set通常用于测试归属性，HashSet对快速查找进行了优化
		set.add("d");
		set.add("d");
		set.add("c");
		set.add("c");
		set.add("b");
		set.add("b");
		set.add("a");
		set.add("a");
		System.out.println(set);//Set不保存重复元素，HashSet保存数据的顺序与插入顺序无关，要相对存储顺序进行排序可以使用TreeSet

		set = new TreeSet<String>();//TreeSet对元素进行升序保存 
		set.add("d");
		set.add("d");
		set.add("c");
		set.add("c");
		set.add("b");
		set.add("b");
		set.add("a");
		set.add("a");
		System.out.println(set);

		set = new LinkedHashSet<String>();//LinkedHashSet按照插入的顺序保存元素
		set.add("d");
		set.add("d");
		set.add("c");
		set.add("c");
		set.add("b");
		set.add("b");
		set.add("a");
		set.add("a");
		System.out.println(set);
	}
}

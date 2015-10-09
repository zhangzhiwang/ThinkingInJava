package com.asiainfo.chapter11.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/**
 * p223练习4
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月8日 下午12:57:02
 */
public class Exercise_4 {
	private String[] strs = new String[] { "mission", "impossible", "iron", "man" };
	private int counter;

	public static void main(String[] args) {
		Exercise_4 e = new Exercise_4();
		String[] s = new String[10];
		String[] ss = e.fill(s);
		for (String str : s) {
			System.out.println(str);
		}
		System.out.println("2" + e.fill(new ArrayList<String>()));
		e.counter = 0;
		System.out.println("3" + e.fill(new LinkedList<String>()));
		e.counter = 0;
		System.out.println("4" + e.fill(new HashSet<String>()));
		e.counter = 0;
		System.out.println("5" + e.fill(new TreeSet<String>()));
		e.counter = 0;
		System.out.println("6" + e.fill(new LinkedHashSet<String>()));
	}

	public String next() {
		String s = strs[counter];
		counter = (counter + 1) % strs.length;
		return s;
	}

	public String[] fill(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = next();
		}
		return arr;
	}

	public Collection<String> fill(Collection<String> col) {
		for (int i = 0; i < 10; i++) {
			col.add(next());
		}
		return col;
	}
}

package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * ListIterator
 * 
 * @author zhangzhiwang
 * @date 2015年10月11日 下午5:20:00
 */
public class Test27 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Arrays.asList("apple", "orange", "nut"));
		System.out.println(list);
		ListIterator<String> it = list.listIterator();
		while (it.hasNext()) {
			String i = it.next();
			System.out.println(i + "\t" + it.nextIndex() + "\t" + it.previousIndex());
		}
		System.out.println("-------------");
		while (it.hasPrevious()) {
			String i = it.previous();
			System.out.println(i + "\t" + it.previousIndex() + "\t" + it.nextIndex());
		}
		System.out.println("---------");
		ListIterator<String> it2 = list.listIterator(1);
//		while (it2.hasNext()) {
//			String i = it2.next();
//			System.out.println(i + "\t" + it2.nextIndex() + "\t" + it2.previousIndex());
//		}
//		System.out.println("-------------");
		while (it2.hasPrevious()) {
			String i = it2.previous();
			System.out.println(i + "\t" + it2.previousIndex() + "\t" + it2.nextIndex());
		}
		System.out.println("-------------");
		ListIterator<String> it3 = list.listIterator(1);
		while(it3.hasNext()) {
			it3.next();
			it3.set("replace");
		}
		System.out.println(list);
	}
}

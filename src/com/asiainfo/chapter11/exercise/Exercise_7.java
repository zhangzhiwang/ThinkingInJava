package com.asiainfo.chapter11.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * p226练习7
 * 
 * @author zhangzhiwang
 * @date 2015年10月11日 下午1:39:38
 */
public class Exercise_7 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		List<Integer> sub = list.subList(1, 3);
		System.out.println(sub);
		System.out.println(list);
		//		list.removeAll(sub);//java.util.ConcurrentModificationException
		List<Integer> subList = new ArrayList<Integer>(sub);
		list.removeAll(subList);
		System.out.println(list);
		/*
		 * 以下内容摘抄自 The_Thinking_in_Java_Annotated_Solution_Guide(TIJ4-solutions)
		 * p188 The methods asList( ) and subList( ) return immutable Lists
		 * because they are “backed” by the underlying array and list,
		 * respectively. If you structurally modify the backing list as we did
		 * in the commented-out section, you get a concurrent modification
		 * exception. Therefore, the program operates on the sublist instead of
		 * the backing list. Alternatively, avoid errors by creating a separate
		 * copy of the returned sublist and use that as an argument to
		 * removeAll( ).
		 */
	}
}

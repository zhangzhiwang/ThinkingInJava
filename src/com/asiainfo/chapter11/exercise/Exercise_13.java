package com.asiainfo.chapter11.exercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * p229练习13
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月12日 下午1:35:05
 */
public class Exercise_13 {
	private List<Integer> list = new LinkedList<Integer>();

	public void addElement(Integer i) {
		list.add(i);
	}

	public void run() {
		List<Integer> copy = new LinkedList<Integer>(list);
		Iterator<Integer> it = copy.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
			list.remove(new Integer(i));
		}
	}

	public static void main(String[] args) {
		Exercise_13 e = new Exercise_13();
		for (int i = 0; i < 10; i++) {
			e.addElement(i);
		}
		System.out.println(e.list);
		e.run();
		System.out.println(e.list);
	}
}

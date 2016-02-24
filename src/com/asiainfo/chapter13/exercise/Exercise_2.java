package com.asiainfo.chapter13.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * p288练习2
 * 
 * @author zhangzw8
 * @date 2016年2月24日 上午9:29:13
 */
public class Exercise_2 {
	public static void main(String[] args) {
		List<D> l = new ArrayList<D>();
		for (int i = 1; i <= 3; i++) {
			l.add(new D());
		}
		System.out.println(l);
	}
}

class D {
	@Override
	public String toString() {
		return "hello " + super.toString();
	}
}
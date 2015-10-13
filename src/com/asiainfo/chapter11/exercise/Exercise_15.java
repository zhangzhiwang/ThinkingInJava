package com.asiainfo.chapter11.exercise;

import java.util.Stack;

/**
 * p231练习15
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月13日 上午11:07:15
 */
public class Exercise_15 {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		s.append(func1("U", "n", "c")).append(func1("e", "r", "t")).append(func1("a")).append(func1("i")).append(func1("n", "t", "y")).append(func1(" ")).append(func1("r", "u")).append(func1("l", "e", "s"));
		System.out.println(s.toString());

	}

	public static String func1(String... strs) {
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < strs.length; i++) {
			stack.push(strs[i]);
		}
		StringBuffer s = new StringBuffer();
		while (!stack.isEmpty()) {
			s.append(stack.pop());
		}
		return s.toString();
	}
}

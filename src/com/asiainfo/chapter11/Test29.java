package com.asiainfo.chapter11;

import java.util.Stack;

/**
 * Stack——栈
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月13日 上午10:25:15
 */
public class Test29 {
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		for (int i = 0; i < 10; i++) {
			s1.add(i);
		}

		for (int i = 0; i < s1.size(); i++) {
			System.out.print(s1.get(i) + "\t");
		}
		System.out.println("--------------");
		Stack<Integer> s2 = new Stack<Integer>();
		for (int i = 0; i < 10; i++) {
			s2.push(i);
		}
		while (!s2.isEmpty()) {
			System.out.print(s2.pop() + "\t");
		}
		System.out.println("----------------");
		System.out.println(s2);
		System.out.println("-------------------");

		Stack<Integer> s3 = new Stack<Integer>();
		for (int i = 0; i < 10; i++) {
			s3.push(i);
		}
		System.out.println(s3.size());
		for (int i = 0; i < 10; i++) {
			System.out.print(s3.peek() + "\t");
			s3.pop();
		}
	}
}

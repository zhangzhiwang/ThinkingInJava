package com.asiainfo.chapter11;

import java.util.Stack;

/**
 * Stack——栈
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月13日 上午10:50:42
 */
public class Test30 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		String[] strs = "This is a stack".split(" ");
		for (String s : strs) {
			System.out.print(s + "\t");
		}
		System.out.println();
		for (int i = 0; i < strs.length; i++) {
			stack.push(strs[i]);
		}
		System.out.println(stack);
		for (int i = 0; i < stack.size(); i++) {
			System.out.print(stack.get(i) + "\t");
		}
	}
}

package com.asiainfo.chapter11;

import java.util.Stack;

/**
 * Stack——栈（后进先出）
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月3日 下午9:11:59
 */
public class Test69 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);// 向栈顶押入元素
		stack.push(2);
		stack.push(3);
		System.out.println("stack.size = " + stack.size());
		System.out.println(stack);
		for (int i = 0; i < stack.size(); i++) {
			System.out.print(stack.get(i) + "\t");
		}
		System.out.println();

		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + "\t");// 获取并移除栈顶元素
		}
		System.out.println();
		System.out.println("stack.size = " + stack.size());
	}
}

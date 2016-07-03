package com.asiainfo.chapter15.exercise;

/**
 * p357练习5——内部类可以访问外部类的类型参数
 *
 * @author zhiwangzhang
 * @date 2016年7月2日 下午2:44:04
 */
public class Exercise_5 {
	public static void main(String[] args) {
		LinkedStack<String> ls = new LinkedStack<String>();
		for (String s : new String[] { "a", "b", "c" }) {
			ls.push(s);
		}
		String s = null;
		while ((s = ls.pop()) != null) {
			System.out.println(s);
		}
	}
}

class LinkedStack<T> {
	private Node node = new Node();// 末端哨兵

	class Node {
		private T t;
		private Node nextNode;

		public Node() {
			this.t = null;
			this.nextNode = null;
		}

		public Node(T t, Node node) {
			this.t = t;
			this.nextNode = node;
		}

		public boolean end() {
			return t == null && nextNode == null;
		}
	}

	public void push(T t) {
		node = new Node(t, node);
	}

	public T pop() {
		T t = node.t;
		if (!node.end()) {
			node = node.nextNode;
		}
		return t;
	}
}
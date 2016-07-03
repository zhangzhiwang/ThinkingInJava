package com.asiainfo.chapter15;

/**
 * 先进后出（FILO）的存储机制
 *
 * @author zhiwangzhang
 * @date 2016年7月2日 下午2:19:34
 */
public class Test17 {
	public static void main(String[] args) {
		LinkedStack<Integer> ls = new LinkedStack<Integer>();
		for (Integer i : new Integer[] { 1, 2, 3 }) {
			ls.push(i);
		}
		Integer num = null;
		while ((num = ls.pop()) != null) {
			System.out.println(num);
		}
	}
}

class LinkedStack<T> {
	private Node<T> node = new Node<T>();// 末端哨兵

	class Node<T> {
		private T t;
		private Node<T> node;

		public Node() {
			this.t = null;
			this.node = null;
		}

		public Node(T t, Node<T> node) {
			this.t = t;
			this.node = node;
		}

		public boolean end() {
			return t == null && node == null;
		}
	}

	public void push(T t) {
		node = new Node<T>(t, node);
	}

	public T pop() {
		T t = node.t;
		if (!node.end()) {
			node = node.node;
		}
		return t;
	}

}
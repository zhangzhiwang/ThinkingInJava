package com.asiainfo.chapter11;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Queue
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月29日 上午11:27:00
 */
public class Test54 {
	public static void main(String[] args) {
		Queue<Integer> queue1 = new LinkedList<Integer>();
		for (int i = 1; i <= 10; i++) {
			queue1.offer(i);
		}
		func1(queue1);
	}
	
	public static void func1(Queue queue) {
		while (queue.peek() != null) {
			System.out.print(queue.poll() + "\t");
		}
		System.out.println();
	}
}

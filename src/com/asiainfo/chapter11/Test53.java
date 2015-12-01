package com.asiainfo.chapter11;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月28日 下午6:48:25
 */
public class Test53 {
	public static void main(String[] args) {
		System.out.println("向队尾添加元素：");
		Queue<Integer> queue1 = new LinkedList<Integer>();// LinkedList实现了Queue接口
		queue1.add(1);
		System.out.println(queue1);
		queue1.offer(2);// add和offer都是向队列尾添加元素，二者的区别是，当达到了队列的容量限制而再添加元素时，前者会抛异常后者会返回false
		System.out.println(queue1);
		System.out.println("获取但不移除队列的头：");
		System.out.println(queue1.peek());
		System.out.println(queue1);
		System.out.println(queue1.element());
		System.out.println(queue1);
		Queue<Integer> queue2 = new LinkedList<Integer>();
		System.out.println(queue2.peek());
		// System.out.println(queue2.element());
		System.out.println("summary：peek()和element()都能获取（但不移除）队列的头，二者的区别是：当队列为空时前者会返回null而后者抛异常");
		System.out.println("获取并移除队列的头：");
		Queue<Integer> queue3 = new LinkedList<Integer>();
		queue3.offer(1);
		queue3.offer(2);
		queue3.offer(3);
		System.out.println(queue3);
		System.out.println(queue3.poll());
		System.out.println(queue3);
		System.out.println(queue3.remove());
		System.out.println(queue3);
		queue3.clear();
		System.out.println(queue3.poll());
		// System.out.println(queue3.remove());
		System.out.println("summary：poll()和remove()都能获取并移除队列的头，二者的区别是：在对列为空的情况下，前者返回null，后者直接抛异常");
	}
}

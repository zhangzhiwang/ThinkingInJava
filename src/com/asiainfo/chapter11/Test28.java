package com.asiainfo.chapter11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月12日 下午12:28:33
 */
public class Test28 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(list);
		System.out.println(list.getFirst());//getFirst()与element()完全一样，查看element()源码可知
		System.out.println(list.element());
		System.out.println(list.peek());
		list.clear();
//		System.out.println(list.getFirst());//当list.size()=0时，getFirst()抛出异常java.util.NoSuchElementException
		System.out.println(list.peek());//当list.size()=0时，peek()返回null
		System.out.println("----------------------------");

		list = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(list);
		System.out.println(list.remove());//remove()与removeFirst()是一样的，可查看remove()源码
		System.out.println(list);
		System.out.println(list.removeFirst());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		list.clear();
//		System.out.println(list.remove());//当list为空时，remove()抛异常NoSuchElementException，removeFirst()同理
//		System.out.println(list.removeFirst());
		System.out.println(list.poll());///当list为空时，poll()返回null
		System.out.println("---------------------");
		
		list = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(list);//add()、addLast()、offer()效果是完全一样的，打开源码
		list.addFirst(0);
		System.out.println(list);
		list.offer(6);
		System.out.println(list);
		list.add(7);
		System.out.println(list);
		list.addLast(8);
		System.out.println(list);
		System.out.println(list.removeLast());
		System.out.println(list);
	}
}

package com.asiainfo.chapter21;

/**
 * 线程的三种常用优先级——MAX_PRIORITY、NORM_PRIORITY、MIN_PRIORITY
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 下午2:44:41
 */
public class Test12 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().MAX_PRIORITY);
		System.out.println(Thread.currentThread().NORM_PRIORITY);
		System.out.println(Thread.currentThread().MIN_PRIORITY);
	}
}

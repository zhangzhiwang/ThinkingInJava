package com.asiainfo.chapter21;

/**
 * 注意打印线程类对象（test14）和打印该对象所代表的线程对象(thread14)的区别
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 下午3:19:55
 */
public class Test14 implements Runnable {
	public void run() {
	}
	
	public static void main(String[] args) {
		Test14 test14 = new Test14();
		Thread thread14 = new Thread(test14);
		System.out.println(test14);//打印线程类对象，Test14是一个线程类（因实现了Runnable），所以Test14的对象为线程类对象
		System.out.println(thread14);//打印程类对象test14所代表的线程对象thread14
	}
}

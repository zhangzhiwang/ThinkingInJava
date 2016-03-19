package com.asiainfo.chapter21;

/**
 * 打印线程——调用Thread类的toString()
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 下午2:12:29
 */
public class Test10 implements Runnable {
	public static void main(String[] args) {
		Thread t = new Thread(new Test10());
		t.start();
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread());//Thread[Thread-0,5,main]   []里面的三部分分别为：线程名、线程优先级和线程组
	}
}

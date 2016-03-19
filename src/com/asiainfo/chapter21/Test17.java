package com.asiainfo.chapter21;

import java.util.concurrent.TimeUnit;

/**
 * Thread的isDaemon()方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 下午4:15:25
 */
public class Test17 implements Runnable {
	@Override
	public void run() {
		Thread t = new Thread(new C());
		t.start();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t= new Thread(new Test17());
		t.setDaemon(true);//某线程被置为守护线程，那么它所产生的线程都为守护线程而无须显示声明
		t.start();
		TimeUnit.SECONDS.sleep(1);
	}
}

class C implements Runnable {
	@Override
	public void run() {
		System.out.println("1:" + Thread.currentThread().isDaemon());
		Thread t = new Thread(new C1());
//		t.setDaemon(false);
		t.start();
	}
}

class C1 implements Runnable {
	@Override
	public void run() {
		System.out.println("2:" + Thread.currentThread().isDaemon());
	}
}

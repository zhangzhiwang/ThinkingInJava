package com.asiainfo.chapter21;

import java.util.concurrent.TimeUnit;

/**
 * finally语句块在守护线程中是否被执行取决于最后一个用户线程退出时（整个程序退出时）守护线程是否已经执行到了finally语句块
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 下午5:07:22
 */
public class Test19 {
	public static void main(String[] args) throws InterruptedException {
		Thread td = new Thread(new D());
		td.setDaemon(true);
		td.start();
		new Thread(new D1()).start();
		Thread.currentThread().sleep(10);
		System.out.println("main out!");
	}
}

class D implements Runnable {
	@Override
	public void run() {
		try {
			TimeUnit.MILLISECONDS.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("D finally.");
		}
	}
}

class D1 implements Runnable {
	@Override
	public void run() {
		try {
			TimeUnit.MILLISECONDS.sleep(100);
			System.out.println("D1 out!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
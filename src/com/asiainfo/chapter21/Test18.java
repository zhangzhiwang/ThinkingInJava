package com.asiainfo.chapter21;

import java.util.concurrent.TimeUnit;

/**
 * finally语句块可以在守护线程中不执行（执不执行取决于程序在守护线程执行到finally语句块之前是不是退出），但是在用户线程总是会被执行
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 下午4:33:08
 */
public class Test18 implements Runnable {
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(1);
			String s = null;
			s.length();
		} catch (Exception e) {
			System.out.println("NullPointerException." + e);
		} finally {
			System.out.println("hello world!");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new Test18());
//		t.setDaemon(true);
		t.start();
		TimeUnit.MILLISECONDS.sleep(100);
	}
}

package com.asiainfo.chapter21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock获取锁的方法之一——lock()
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月31日 下午8:29:55
 */
public class Test58 implements Runnable {
	private Lock lock = new ReentrantLock(); 
	@Override
	public void run() {
		met1();
	}
	
	public void met1() {
		lock.lock();//类似synchronized的功能
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			while(true) {}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public static void main(String[] args) {
		Test58 t = new Test58();
		for (int i = 1; i <= 5; i++) {
			new Thread(t).start();
		}
	}
}

package com.asiainfo.chapter21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock获取锁的方法之二——tryLock()
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月31日 下午9:09:45
 */
public class Test60 implements Runnable {
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		met1();
	}

	public void met1() {
		if (lock.tryLock()) {
			try {
				System.out.println(Thread.currentThread().getName() + " got lock");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				lock.unlock();
			}
		} else {
			System.out.println(Thread.currentThread().getName() + " do sth. else");
		}
	}

	public static void main(String[] args) {
		Test60 t = new Test60();
		for (int i = 1; i <= 10; i++) {
			new Thread(t).start();
		}
	}
}

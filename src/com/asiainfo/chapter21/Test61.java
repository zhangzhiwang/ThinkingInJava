package com.asiainfo.chapter21;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock获取锁的方法之三——tryLock(long time, TimeUnit unit)
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月31日 下午9:34:42
 */
public class Test61 implements Runnable {
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {

	}

	public void met1() {
		try {
			if (lock.tryLock(10, TimeUnit.SECONDS)) {// 如果刚开始没有获取到锁，则等待指定时间，如果指定时间内仍然没有获取到锁，那么返回false，否则返回true。和synchronized不同的是后者会一直等待下去
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
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Test60 t = new Test60();
		for (int i = 1; i <= 10; i++) {
			new Thread(t).start();
		}
	}
}

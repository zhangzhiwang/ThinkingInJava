package com.asiainfo.chapter21;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock的两种尝试获取锁的方法之二
 * 
 * @author zhangzw8
 * @date 2016年3月31日 上午9:46:20
 */
public class Test55 implements Runnable {
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		while (true) {
			try {
				boolean b = lock.tryLock(1, TimeUnit.SECONDS);
				if (b) {
					met1();
					return;
				} else {
					System.out.println(name + "做点别的");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void met1() {
		lock.lock();
		String name = Thread.currentThread().getName();
		System.out.println(name + "获得了锁");
		try {
			System.out.println(name + "处理任务");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "释放锁");
		lock.unlock();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Test55 t = new Test55();
		Thread t1 = new Thread(t);
		t1.start();
		Thread.sleep(1000);
		Thread t2 = new Thread(t);
		t2.start();
	}
}

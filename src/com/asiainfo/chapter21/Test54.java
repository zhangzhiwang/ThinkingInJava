package com.asiainfo.chapter21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock的两种尝试获取锁的方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月30日 下午10:06:37
 */
public class Test54 implements Runnable {
	private Lock lock = new ReentrantLock();
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("t1")) {
			met1();
		} else {
			while(true) {
				if (!lock.tryLock()) {
					System.out.println("如果没有获取锁就做点别的事情" + name);
				} else {
					met1();
					break;
				}
			}
		}
	}
	
	public void met1() {
		lock.lock();//获取锁
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		lock.unlock();
	}
	
	public static void main(String[] args) {
		Test54 t = new Test54();
		for (int i = 1; i <= 2; i++) {
			new Thread(t, "t" + (i+1)).start();
		}
	}
}

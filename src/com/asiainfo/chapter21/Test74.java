package com.asiainfo.chapter21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 如何用显示的Lock对象创建临界区
 * 
 * @author zhangzw8
 * @date 2016年4月3日 下午5:10:41
 */
public class Test74 implements Runnable {
	private Lock lock = new ReentrantLock();

	public void run() {
	}

	public void met1() {
		System.out.println("some codes...");
		synchronized (this) {
			System.out.println("sync");
		}
		System.out.println("some other codes...");
	}

	public void met2() {
		System.out.println("some codes...");
		lock.lock();
		try {
			System.out.println("sync");
		} finally {
			lock.unlock();
		}
		System.out.println("some other codes...");
	}
}

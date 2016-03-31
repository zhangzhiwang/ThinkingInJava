package com.asiainfo.chapter21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * lock()
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月31日 下午9:02:20
 */
public class Test59 implements Runnable {
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("t1")) {
			met1();
		} else if(name.equals("t2")) {
			met2();
		} else {
			met3();
		}
	}

	public void met1() {
		lock.lock();
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void met2() {
		lock.lock();
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void met3() {
		lock.lock();
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public static void main(String[] args) {
		Test59 t = new Test59();
		for (int i = 1; i <= 3; i++) {
			new Thread(t, "t" + i).start();
		}
	}
}

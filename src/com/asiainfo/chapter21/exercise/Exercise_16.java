package com.asiainfo.chapter21.exercise;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * p690练习15
 * 
 * @author zhangzw8
 * @date 2016年4月3日 下午6:01:18
 */
public class Exercise_16 implements Runnable {
	private Lock l1 = new ReentrantLock();
	private Lock l2 = new ReentrantLock();
	private Lock l3 = new ReentrantLock();

	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("t1")) {
			met1();
		} else if (name.equals("t2")) {
			met2();
		} else {
			met3();
		}
	}

	public void met1() {
		l1.lock();
		try {
			while (true) {
			}
		} finally {
			l1.unlock();
		}
	}

	public void met2() {
		l2.lock();
		try {
			System.out.println("hello");
		} finally {
			l2.unlock();
		}
	}

	public void met3() {
		l3.lock();
		try {
			System.out.println("world");
		} finally {
			l3.unlock();
		}
	}

	public static void main(String[] args) {
		Exercise_16 e = new Exercise_16();
		Thread t1 = new Thread(e, "t1");
		Thread t2 = new Thread(e, "t2");
		Thread t3 = new Thread(e, "t3");
		t1.start();
		t2.start();
		t3.start();
	}
}

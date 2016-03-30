package com.asiainfo.chapter21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Lock进行加锁
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月30日 下午9:12:09
 */
public class Test50 extends Thread {
	private int num;
	private Lock lock = new ReentrantLock();
	@Override
	public void run() {
		met1();
	}
	
	public void met1() {
		lock.lock();
		for (int i = 1; i <= 10000; i++) {
			num++;
		}
		System.out.println(num);
		lock.unlock();
	}
	
	public static void main(String[] args) {
		Test50 t = new Test50();
		for (int i = 1; i <= 2; i++) {
			new Thread(t).start();
		}
	}
	
}

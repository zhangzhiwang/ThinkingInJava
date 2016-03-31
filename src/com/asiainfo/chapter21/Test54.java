package com.asiainfo.chapter21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock的两种尝试获取锁的方法之一
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
				boolean b = lock.tryLock();
				if (!b) {
					System.out.println("lock.tryLock() = " + b);
					System.out.println("如果没有获取锁就做点别的事情" + name);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					met1();
					break;
				}
			}
		}
	}
	
	public void met1() {
		lock.lock();//获取锁
		String name = Thread.currentThread().getName();
		System.out.println(name + "获得了锁");
		try {
			System.out.println(name + "执行任务");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(name + "释放锁");
		lock.unlock();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Test54 t = new Test54();
		for (int i = 1; i <= 3; i++) {
			new Thread(t, "t" + i).start();
			Thread.sleep(10000);
		}
	}
}

package com.asiainfo.chapter21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock的unlock()方法要放到finally{}中
 * 有关java Lock可详见http://www.cnblogs.com/dolphin0520/p/3923167.html
 * @author zhangzw8
 * @date 2016年3月31日 下午1:33:43
 */
public class Test57 implements Runnable {
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		// met1();
		met2();
	}

	public synchronized void met1() {
		try {
			String name = Thread.currentThread().getName();
			if (name.equals("t1")) {
				System.out.println("t1");
				Thread.sleep(1000);
				throw new RuntimeException("hello");// 抛异常后，synchronized会自动释放锁
			} else {
				Thread.sleep(1000);
				System.out.println("t2");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void met2() {
		lock.lock();
		try {
			String name = Thread.currentThread().getName();
			if (name.equals("t1")) {
				System.out.println("t1");
				Thread.sleep(1000);
				throw new RuntimeException("hello");//因异常退出线程之后Lock不会自动释放锁，Lock获取所和释放锁都是手动执行的
			} else {
				Thread.sleep(1000);
				System.out.println("t2");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Test57 t = new Test57();
		Thread t1 = new Thread(t, "t1");
		Thread t2 = new Thread(t, "t2");
		t1.start();
		Thread.sleep(10);
		t2.start();
	}
}

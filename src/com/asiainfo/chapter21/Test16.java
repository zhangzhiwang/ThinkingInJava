package com.asiainfo.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * 线程工厂
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 下午3:51:42
 */
public class Test16 implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setDaemon(true);
		t.setName("hello world thread");
		t.setPriority(1);
		return t;
	}

	public static void main(String[] args) throws InterruptedException {
		ExecutorService exe = Executors.newCachedThreadPool(new Test16());//使创建的线程全部为守护线程
//		ExecutorService exe = Executors.newCachedThreadPool();//使创建的线程全部为用户线程
		for (int i = 1; i <= 10; i++) {
			exe.execute(new DaemonFromFac());
		}
		System.out.println("Done");
		TimeUnit.MILLISECONDS.sleep(1000);
	}
	
}

class DaemonFromFac implements Runnable {
	private int id;
	
	public DaemonFromFac() {
		super();
	}

	public DaemonFromFac(int id) {
		super();
		this.id = id;
	}

	public void run() {
		System.out.println(Thread.currentThread());
		while (true) {
		}
	}
}
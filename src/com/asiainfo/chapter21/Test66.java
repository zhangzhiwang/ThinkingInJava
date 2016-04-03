package com.asiainfo.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试volatile
 * 
 * @author Zhiwang Zhang
 * @date 2016年4月2日 下午5:51:07
 */
public class Test66 implements Runnable {
	private volatile int num;
	@Override
	public void run() {
		met1();
	}
	
	public synchronized void met1() {//解决并发问题优先考虑synchronized
		num++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newCachedThreadPool();
		Test66 t = new Test66();
		for (int i = 1; i <= 1000; i++) {
			es.execute(t);
		}
		es.shutdown();
		Thread.sleep(3000);
		System.out.println(t.num);
	}
}

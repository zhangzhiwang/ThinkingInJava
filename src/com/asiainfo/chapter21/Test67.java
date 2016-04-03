package com.asiainfo.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Atomic
 * 
 * @author Zhiwang Zhang
 * @date 2016年4月2日 下午6:20:46
 */
public class Test67 implements Runnable{
	private AtomicInteger ai = new AtomicInteger(0);
	public void run() {
		met1();
	}
	
	public void met1() {
		ai.addAndGet(1);
	}
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newCachedThreadPool();
		Test67 t = new Test67();
		for (int i = 1; i <= 1000; i++) {
			es.execute(t);
		}
		es.shutdown();
		Thread.sleep(1000);
		System.out.println(t.ai.get());
	}
}

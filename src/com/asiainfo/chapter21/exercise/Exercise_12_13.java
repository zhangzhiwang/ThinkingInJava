package com.asiainfo.chapter21.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * p684练习12、13
 * 
 * @author Zhiwang Zhang
 * @date 2016年4月2日 下午5:59:44
 */
public class Exercise_12_13 implements Runnable {
	private int i;
	public void run() {
		met1();
	}
	
	public synchronized void met1() {
		i += 2;
	}
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newCachedThreadPool();
		Exercise_12_13 e = new Exercise_12_13();
		for (int i = 1; i <= 1000; i++) {
			es.execute(e);
		}
		es.shutdown();
		Thread.sleep(2000);
		System.out.println(e.i);
	}
}

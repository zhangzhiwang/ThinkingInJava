package com.asiainfo.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * shutdown()和shutdownNow()
 * 
 * @author zhangzw8
 * @date 2016年4月4日 上午11:00:12
 */
public class Test68 implements Runnable {
	public void run() {
		for (int i = 1; i <= 3; i++) {
//			double d = (Math.E + Math.PI) / i;
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
//		System.out.println(Thread.currentThread().getName());
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}

	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		for (int i = 1; i <= 10; i++) {
			es.execute(new Test68());
		}
//		es.shutdown();
		es.shutdownNow();
	}
}

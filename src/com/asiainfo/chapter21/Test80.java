package com.asiainfo.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * yield()方法不释放锁，可参考：http://dylanxu.iteye.com/blog/1322066
 * 
 * @author zhangzw8
 * @date 2016年6月12日 上午9:45:24
 */
public class Test80 extends Thread {
	private static int num;

	@Override
	public void run() {
		increment();
	}

	public void increment() {
		num += 1;
		Thread.yield();
		num += 1;
	}

	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		for (int i = 1; i <= 100; i++) {
			es.execute(new Test80());
		}
		es.shutdown();
		System.out.println("num= " + num);
	}
}

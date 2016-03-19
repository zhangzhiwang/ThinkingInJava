package com.asiainfo.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 线程休眠——sleep()方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 上午11:20:42
 */
public class Test9 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			TimeUnit.SECONDS.sleep(3);//这里用的不是Thread.sleep();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 1; i <= 10; i++) {
			executorService.execute(new Test9());
		}
		executorService.shutdown();
	}
}

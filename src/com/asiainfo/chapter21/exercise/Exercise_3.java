package com.asiainfo.chapter21.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * p658练习3
 * 
 * @author zhangzw8
 * @date 2016年3月18日 下午1:32:56
 */
public class Exercise_3 implements Runnable {
	private String startMsg;
	private String endMsg;
	private int id;

	public static void main(String[] args) {
		//执行器1：
//		ExecutorService executorService = Executors.newCachedThreadPool();
//		for (int i = 1; i <= 10; i++) {
//			executorService.execute(new Exercise_3("StartMsg " + i + ":", "EndMsg " + i + ".", i));
//		}
//		executorService.shutdown();
		
		//执行器2：
//		ExecutorService executorService = Executors.newFixedThreadPool(2);
//		for (int i = 1; i <= 10; i++) {
//			executorService.execute(new Exercise_3("StartMsg " + i + ":", "EndMsg " + i + ".", i));
//		}
//		executorService.shutdown();
		
		//执行器3：
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		for (int i = 1; i <= 10; i++) {
			executorService.execute(new Exercise_3("StartMsg " + i + ":", "EndMsg " + i + ".", i));
		}
		executorService.shutdown();
	}

	public Exercise_3() {
	}

	private Exercise_3(String startMsg, String endMsg) {
		super();
		this.startMsg = startMsg;
		this.endMsg = endMsg;
	}

	private Exercise_3(String startMsg, String endMsg, int id) {
		super();
		this.startMsg = startMsg;
		this.endMsg = endMsg;
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println(startMsg);
		for (int i = 1; i <= 3; i++) {
			System.out.println("(" + Thread.currentThread().getName() + ")" + "hello " + id + ": " + i);
			Thread.yield();
		}
		System.out.println(endMsg);
	}
}

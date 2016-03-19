package com.asiainfo.chapter21.exercise;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * p660练习6
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 上午11:29:20
 */
public class Exercise_6 implements Runnable {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 1; i <= 10; i++) {
			executorService.execute(new Exercise_6());
		}
		executorService.shutdown();
		
//		for (int i = 1; i <= 10; i++) {
//			Thread t = new Thread(new Exercise_6());
//			t.start();
//		}
//		System.out.println("hello");
	}
	
	@Override
	public void run() {
		Random r = new Random();
		try {
			long seconds = r.nextInt(10) + 1;
			TimeUnit.SECONDS.sleep(seconds);
			System.out.println("I've already sleep " + seconds + " s.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

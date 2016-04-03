package com.asiainfo.chapter21.exercise;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * p685练习14
 * 
 * @author Zhiwang Zhang
 * @date 2016年4月2日 下午6:39:11
 */
public class Exercise_14 {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 2; i++) {
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {

				@Override
				public void run() {
					System.out.println("hello");
				}

			}, 1000);
		}
//		Thread.sleep(5000);
//		System.exit(0);
	}
}

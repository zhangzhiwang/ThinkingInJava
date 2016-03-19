package com.asiainfo.chapter21.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * p665练习9
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 下午5:41:24
 */
public class Exercise_9 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool(new EThreadFactory());
		for (int i = 1; i <= 10; i++) {
			es.execute(new E());
		}
		es.shutdown();
	}
}

class EThreadFactory implements ThreadFactory {
	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setPriority(Thread.MAX_PRIORITY);
		return t;
	}
}
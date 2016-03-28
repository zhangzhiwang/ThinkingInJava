package com.asiainfo.chapter21;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * 在线程中捕获run()方法抛出异常的方法
 * 
 * @author zhangzw8
 * @date 2016年3月28日 下午1:32:35
 */
public class Test37 extends Thread {

	public class Test37F implements ThreadFactory {

		@Override
		public Thread newThread(Runnable r) {
			Test37 t = new Test37();
			t.setName("hello");
			t.setPriority(1);
			t.setUncaughtExceptionHandler(new Test37().new Test37UncaughtExceptionHandler());
			return t;
		}
	}

	public class Test37UncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

		@Override
		public void uncaughtException(Thread t, Throwable e) {
			System.out.println("catch you!");
			System.out.println("err:" + e.getMessage());
		}
	}

	@Override
	public void run() {
		System.out.println(this);
		throw new RuntimeException("sth. err!");
	}

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool(new Test37().new Test37F());
		executorService.execute(new Test37());
		executorService.shutdown();
	}
}

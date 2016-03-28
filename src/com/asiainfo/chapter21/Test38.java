package com.asiainfo.chapter21;

/**
 * 捕获run()方法抛出异常的方法
 * 
 * @author zhangzw8
 * @date 2016年3月28日 下午1:48:30
 */
public class Test38 implements Runnable {
	@Override
	public void run() {
		String s = null;
		s.length();
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new Test38());
		t.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){//Thread类的setUncaughtExceptionHandler()方法的作用是将线程传递给UncaughtExceptionHandler，用以跟踪线程（run()方法）抛出的异常
			@Override
			public void uncaughtException(Thread t, Throwable e) {//捕获由线程run()方法抛出的异常
				System.out.println("hello");
				System.out.println("sth. err:" + e.getMessage());
			}
		});
		t.start();
	}
}

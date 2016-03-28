package com.asiainfo.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 设置默认的未捕获异常处理器
 * 
 * @author zhangzw8
 * @date 2016年3月28日 下午2:25:09
 */
public class Test41 extends Thread {
	public void run() {
		throw new RuntimeException("world");
	}

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {// UncaughtExceptionHandler是Thread类的一个内部接口，而defaultUncaughtExceptionHandler是Thread类的一个静态属性
			public void uncaughtException(Thread t, Throwable tt) {
				System.out.println("hello:" + tt.getMessage());
			}
		});
		ExecutorService es = Executors.newCachedThreadPool();
		es.execute(new Test41());
	}
}

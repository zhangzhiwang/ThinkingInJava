package com.asiainfo.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * SingleThreadExecutor——
 * 
 * @author zhangzw8
 * @date 2016年3月18日 下午1:11:01
 */
public class Test6 implements Runnable {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Test6());
		executorService.execute(new Test6());
		executorService.execute(new Test6());
		executorService.execute(new Test6());
		executorService.execute(new Test6());//表面上看是创建了5个线程，但这5个线程在Executor里面是按照创建顺序排队运行的，换句话说就是这5个线程在Executor里面是同步的，所以本例相当于两个线程——一个是主线程，一个是SingleThreadExecutor里面的的那个“单例”线程
		executorService.shutdown();
		System.out.println("hello");
		System.out.println("world");
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}

package com.asiainfo.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Executor
 * 
 * @author zhangzw8
 * @date 2016年3月18日 上午8:49:08
 */
public class Test4 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		// executorService.execute(new B());
		// executorService.shutdown();//Executor会在所有线程都执行完才关闭
		// System.out.println("hello");

//		for (int i = 1; i <= 5; i++) {
//			executorService.execute(new B());//一个Executor被用来创建和管理所有的线程
//		}
//		executorService.shutdown();//Executor会在所有线程都执行完才关闭
//		System.out.println("hello");
		
		executorService.execute(new B());
		executorService.execute(new B(1));//一个Executor可以创建并管理所有的线程
//		executorService.shutdown();//不调用shutdown()方法程序会一直运行
//		executorService.execute(new B());//RejectedExecutionException     Executor被关闭后不能再给它提交新的线程
	}
}

class B implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " ： " + i);
		}
	}
	
	public B() {}
	
	public B(int i) {}
}
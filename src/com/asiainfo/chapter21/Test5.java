package com.asiainfo.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * FixedThreadPool
 * 
 * @author zhangzw8
 * @date 2016年3月18日 下午12:57:10
 */
public class Test5 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 1; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);//与CachedThreadPool的区别是FixedThreadPool限制了线程的数量，详见p657
		for (int i = 1; i <= 2; i++) {//多余的线程加不进去，在FixedThreadPool里面所有的任务都会使用这三个线程来处理，因为里面最多有三个线程，
			executorService.execute(new Test5());
		}
		executorService.shutdown();	
	}
}
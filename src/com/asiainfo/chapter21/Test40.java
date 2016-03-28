package com.asiainfo.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * 线程工厂
 * 
 * @author zhangzw8
 * @date 2016年3月28日 下午2:16:26
 */
public class Test40 implements Runnable {
	@Override
	public void run () {
		System.out.println("hello");
		System.out.println(Thread.currentThread());
	}
	
	public class Test40F implements ThreadFactory {
		@Override
		public Thread newThread(Runnable t) {
			Thread th = new Thread(t);
			th.setName("abc");
			th.setPriority(10);
			return th;
		}
	}
	
	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool(new Test40().new Test40F());
		es.execute(new Test40());
		es.shutdown();
	}
}

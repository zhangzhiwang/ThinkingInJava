package com.asiainfo.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * volatile
 * 
 * @author Zhiwang Zhang
 * @date 2016年4月2日 下午2:26:57
 */
public class Test64 implements Runnable {
	private volatile static int num;
	private volatile static int i;

	@Override
	public void run() {
//		met1();
		met1();
	}

	public void met1() {
		num++;
	}
	
	public void met2() {
		num = i + 1;
	}

	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newCachedThreadPool();
		for(int i = 1; i <= 1000; i++) {
			es.execute(new Test64());
		}
		es.shutdown();
		Thread.sleep(3000);
		System.out.println(Test64.num);//原因详见http://www.cnblogs.com/aigongsi/archive/2012/04/01/2429166.html
	}
}

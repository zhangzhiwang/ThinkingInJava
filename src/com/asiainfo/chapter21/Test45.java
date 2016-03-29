package com.asiainfo.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 有关ExecutorService的注意事项
 * 
 * @author zhangzw8
 * @date 2016年3月29日 下午1:51:25
 */
public class Test45 extends Thread {
	@Override
	public void run() {
//		while(true) {
//			met1();
//		}
		
		System.out.println(getName());
	}
	
	public  void met1() {
		System.out.println(getName());
	}
	
	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		Test45 t = new Test45();
		for (int i = 1; i <= 10; i++) {
			es.execute(t);//注：这里一共新创建了1个线程，最然循环了10次，因为每次循环中execute()方法的参数都传入了同一个线程类对象t，可以理解为一个线程对象start()了10次
		}
		es.shutdown();
	}
}

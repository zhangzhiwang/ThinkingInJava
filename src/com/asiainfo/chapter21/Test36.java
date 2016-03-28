package com.asiainfo.chapter21;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 无法捕获从run()方法抛出异常
 * 
 * @author zhangzw8
 * @date 2016年3月28日 下午1:13:39
 */
public class Test36 extends Thread {
	public static void main(String[] args) {
		try {// 无法捕获run()方法抛出的异常，try/catch不起作用
			Executor executorService = Executors.newCachedThreadPool();
			executorService.execute(new Test36());
		} catch (Exception e) {
			System.out.println("world");
			e.printStackTrace();
		}
	}

	public void run() {
		throw new RuntimeException("Err--:Exception!");
	}
}

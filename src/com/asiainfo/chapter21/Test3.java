package com.asiainfo.chapter21;

/**
 * 线程之间并非同时运行而是交替运行（多CPU可以真正同时运行多个线程）
 * 
 * @author zhangzw8
 * @date 2016年3月17日 下午1:49:01
 */
public class Test3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			Thread t = new Thread(new A());
			t.start();
		}
	}
}

class A implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i < 30; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}
package com.asiainfo.chapter21;

/**
 * 自管理（自启动）的线程3——将线程类作为内部类，内部类实现Runnable
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月20日 上午10:42:21
 */
public class Test26 {
	public class Inner implements Runnable {
		public Inner() {
		}

		public Inner(String name) {
			new Thread(this, name).start();
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public Test26() {}
	public Test26(String name) {
		new Inner(name);
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			new Test26("hello " + i);
		}
	}
}

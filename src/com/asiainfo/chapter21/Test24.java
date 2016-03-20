package com.asiainfo.chapter21;

/**
 * 自管理（自启动）的线程1——将线程类作为内部类，内部类继承Thread
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月20日 上午10:24:15
 */
public class Test24 {
	private Inner i;

	public Test24(String name) {
		i = new Inner(name);
	}

	public Test24() {
		super();
	}

	public class Inner extends Thread {
		public Inner() {
		}

		public Inner(String name) {
			super(name);
			start();
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			new Test24("hello " + i);
		}
	}
}

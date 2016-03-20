package com.asiainfo.chapter21;

/**
 * 自管理（自启动）的线程4——将线程类作为匿名内部类，匿名内部类实现Runnable
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月20日 上午10:48:24
 */
public class Test27 {
	public Test27() {}
	public Test27(final String name) {
		new Runnable(){
			private Thread t;
			{
				t = new Thread(this, name);
				t.start();
			}
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
	}
	
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			new Test27("hello " + i);
			new Test27_1("world------------------" + i);
		}
	}
}

class Test27_1 {
	public Test27_1() {}
	public Test27_1(String name) {
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		}, name).start();
	}
}
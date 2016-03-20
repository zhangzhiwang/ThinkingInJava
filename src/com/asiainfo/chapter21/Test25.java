package com.asiainfo.chapter21;

/**
 * 自管理（自启动）的线程2——将线程类作为匿名内部类，匿名内部类继承Thread
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月20日 上午10:36:35
 */
public class Test25 {
	private Thread t;
	
	public Test25() {}
	public Test25(String name) {
		t = new Thread(name){
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		t.start();
	}
	
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			new Test25("hello " + i);
		}
	}
}

package com.asiainfo.chapter21;

/**
 * 自管理的Runnable——创建其实现类对象的时候就启动线程，即start()方法在构造器里
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月20日 上午10:16:41
 */
public class Test23 implements Runnable {
	private Thread t;

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public Test23(String name) {
		t = new Thread(this, name);
		t.start();
	}
	
	public Test23() {}
	
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			new Test23("hello " + i);
		}
	}
}

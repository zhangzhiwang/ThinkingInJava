package com.asiainfo.chapter21;

/**
 * Runnable子类的子类如果不重写run()方法则会调用父类的run()方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 上午10:36:53
 */
public class Test8 implements Runnable {
	public static void main(String[] args) {
		Thread t = new Thread(new Test8_1());
		t.start();
	}
	
	@Override
	public void run() {
		System.out.println("Test8.run()");
	}
}

class Test8_1 extends Test8 {
	@Override
	public void run() {
		System.out.println("Test8_1.run()");
	}
}
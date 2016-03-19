package com.asiainfo.chapter21;

/**
 * 通过继承Thread类来建立线程
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 下午6:37:12
 */
public class Test21 extends Thread {

	public Test21() {
	}

	public Test21(String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
//			Test21 t = new Test21("hello");//通过构造器设置线程名
			Test21 t = new Test21();//通过构造器设置线程名
			t.start();
		}
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName());
		}
	}
}

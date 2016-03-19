package com.asiainfo.chapter21;

/**
 * 建立线程的方法之二——继承Thread类
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 下午6:33:20
 */
public class Test20 extends Thread {//间接地实现了Runnable接口
	public static void main(String[] args) {
		Test20 t = new Test20();
		t.start();
	}
	
	@Override
	public void run() {
		System.out.println("Test20");
	}
}

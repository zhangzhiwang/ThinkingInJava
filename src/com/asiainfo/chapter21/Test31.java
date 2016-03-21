package com.asiainfo.chapter21;

/**
 * interrupt()——API的解释就四个字：中断线程，这很容易导致误解。
 * 
 * @author zhangzw8
 * @date 2016年3月21日 上午9:40:42
 */
public class Test31 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 100000; i++) {
			System.out.println(i);
		}
		System.out.println("I'm not interrupted!");
	}
	
	public static void main(String[] args) throws InterruptedException {
		Test31 t = new Test31();
		t.start();
		t.interrupt();
	}
}

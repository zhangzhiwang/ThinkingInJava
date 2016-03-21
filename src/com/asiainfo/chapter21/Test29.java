package com.asiainfo.chapter21;

/**
 * 使异步变同步——join()
 * 
 * @author zhangzw8
 * @date 2016年3月21日 上午8:59:02
 */
public class Test29 extends Thread {
	public static void main(String[] args) throws InterruptedException {
		Test29 t = new Test29();
		t.start();
		t.join();
//		t.join(500);
		System.out.println(t.isAlive());//测试线程是否处于活动状态，涉及线程整个生命周期的各种状态
		System.out.println("hello");
	}
	
	@Override
	public void run() {
		try {
			Thread.currentThread().sleep(3000);
			System.out.println("world");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

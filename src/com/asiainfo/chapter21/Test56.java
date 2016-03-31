package com.asiainfo.chapter21;

/**
 * synchronized的缺陷——某一个线程获取锁而不释放，其它线程要想运行此代码块只能等待，影响运行效率
 * 
 * @author zhangzw8
 * @date 2016年3月31日 下午1:24:48
 */
public class Test56 implements Runnable {
	@Override
	public void run() {
		met1();
	}
	
	public synchronized void met1() {
		System.out.println(Thread.currentThread().getName());
		while (true) {}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Test56 t = new Test56();
		for (int i = 1; i <= 10; i++) {
			new Thread(t).start();
			Thread.sleep(10);
		}
	}
}

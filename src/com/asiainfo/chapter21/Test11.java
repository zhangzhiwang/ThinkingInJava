package com.asiainfo.chapter21;

/**
 * 线程的优先级
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 下午2:23:22
 */
public class Test11 implements Runnable {
	private int newPriority;
	
	public Test11() {}
	
	public Test11(int i) {
		newPriority = i;
	}
	
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			new Thread(new Test11(i)).start();
		}
		for (int i = 1; i <= 10; i++) {
			new Thread(new Test11(10)).start();
		}
	}
	
	@Override
	public void run() {
		Thread.currentThread().setPriority(newPriority);
		for (int i = 1; i <= 100000; i++) {
			double d = (Math.PI + Math.E)/i;
			if (i % 1000 == 0) {
				Thread.yield();
			}
		}
//			Thread.yield();
			System.out.println(Thread.currentThread());
	}
}

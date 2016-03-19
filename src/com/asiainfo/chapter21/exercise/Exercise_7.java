package com.asiainfo.chapter21.exercise;

/**
 * p665练习7——参考《The_Thinking_in_Java_Annotated_Solution_Guide》会发现此练习主要是测试最后一个用户线程结束时守护线程是否还继续运行
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 下午5:32:11
 */
public class Exercise_7 implements Runnable {
	public void run() {
		Thread t = new Thread(new E());
		t.setDaemon(true);
		t.start();
		try {
			Thread.sleep(1000);
			System.out.println("Exercise_7 out!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		new Thread(new Exercise_7()).start();
		Thread.sleep(10);
		System.out.println("main out!");
	}
}

class E implements Runnable {
	public void run() {
		try {
			Thread.currentThread().sleep(100);
			System.out.println(Thread.currentThread());
			System.out.println("E out!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
}
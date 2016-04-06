package com.asiainfo.chapter21.exercise;

/**
 * p690练习15
 * 
 * @author zhangzw8
 * @date 2016年4月3日 下午5:53:50
 */
public class Exercise_15 implements Runnable {
	private Exercise_1 e = new Exercise_1();
	private Exercise_3 e2 = new Exercise_3();

	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("t1")) {
			met1();
		} else if (name.equals("t2")) {
			met2();
		} else {
			met3();
		}
	}

	public void met1() {
		synchronized (e) {
			while (true) {
			}
		}
	}

	public void met2() {
		synchronized (this) {
			System.out.println("hello");
		}
	}

	public void met3() {
		synchronized (e2) {
			System.out.println("world");
		}
	}

	public static void main(String[] args) {
		Exercise_15 e = new Exercise_15();
		Thread t1 = new Thread(e, "t1");
		Thread t2 = new Thread(e, "t2");
		Thread t3 = new Thread(e, "t3");
		t1.start();
		t2.start();
		t3.start();
	}
}

package com.asiainfo.chapter21.exercise;

/**
 * p656练习1
 * 
 * @author zhangzw8
 * @date 2016年3月17日 下午2:00:48
 */
public class Exercise_1 implements Runnable {
	private String startMsg;
	private String endMsg;
	private int id;

	public Exercise_1() {
	}

	private Exercise_1(String startMsg, String endMsg) {
		super();
		this.startMsg = startMsg;
		this.endMsg = endMsg;
	}

	private Exercise_1(String startMsg, String endMsg, int id) {
		super();
		this.startMsg = startMsg;
		this.endMsg = endMsg;
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println(startMsg);
		for (int i = 1; i <= 3; i++) {
			System.out.println("hello " + id + ": " + i);
			Thread.yield();
		}
		System.out.println(endMsg);
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Thread t = new Thread(new Exercise_1("StartMsg " + i + ":", "EndMsg " + i + ".", i));
			t.start();
		}
	}
}

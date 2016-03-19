package com.asiainfo.chapter21;

/**
 * p654 LiftOff程序
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 下午2:56:09
 */
public class Test13 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			new Thread(new LiftOff(3)).start();
		}
	}
}

class LiftOff implements Runnable {
	private int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
	public LiftOff(int countDown) {
		super();
		this.countDown = countDown;
	}
	public LiftOff() {
		super();
	}
	
	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + "),";
	}
	
	public void run() {
		while (countDown-- > 0) {
			System.out.print(status());
			Thread.yield();
		}
	}
} 
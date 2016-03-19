package com.asiainfo.chapter21.exercise;

/**
 * p665练习8
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 下午6:46:40
 */
public class Exercise_8 extends Thread {
	public static void main(String[] args) throws InterruptedException {
		Exercise_8 e = new Exercise_8();
		e.setDaemon(true);
		e.start();
		Thread.sleep(100);
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 100000; i++) {
			System.out.println(i);
		}
	}
}

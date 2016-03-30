package com.asiainfo.chapter21.exercise;

/**
 * p678练习11
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月30日 下午7:22:22
 */
public class Exercise_11 extends Thread {
	private int num;
	
	@Override
	public void run() {
		met1();
	}
	
	public synchronized void met1() {
		for (int i = 1; i <= 10000; i++) {
			num++;
		}
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Exercise_11 e = new Exercise_11();
		for (int i = 1; i <= 3; i++) {
			new Thread(e).start(); 
		}
	}
}

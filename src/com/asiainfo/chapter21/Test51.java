package com.asiainfo.chapter21;

/**
 * 抛异常时线程会终止
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月30日 下午9:26:42
 */
public class Test51 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 5) {
				throw new RuntimeException("hello");
			}
		}
	}
	
	public static void main(String[] args) {
		Test51 t = new Test51();
		t.start();
	}
}

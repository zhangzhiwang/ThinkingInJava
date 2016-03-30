package com.asiainfo.chapter21;

/**
 * 创建线程的两种方式
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月30日 下午7:47:05
 */
public class Test49 {
	public class Thread1 extends Thread {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
			System.out.println(getName());
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Test49().new Thread1(), "t1");
		t1.start();
	}
}

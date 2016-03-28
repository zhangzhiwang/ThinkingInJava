package com.asiainfo.chapter21;

/**
 * 捕获线程run()方法抛出异常的方法
 * 
 * @author zhangzw8
 * @date 2016年3月28日 下午1:59:38
 */
public class Test39 extends Thread {
	@Override
	public void run() {
		try {
			met1();
		} catch (Exception e) {
			System.out.println("hello:" + e.getMessage());
			throw new RuntimeException(e);
		}
	}

	public void met1() {
		String s = null;
		s.length();
	}
	
	public static void main(String[] args) {
//		try {
//			Test39 t= new Test39();
//			t.start();
//		} catch (Exception e) {//捕获不了
//			System.out.println("world:" + e.getMessage());
//		}
		
		Test39 t= new Test39();
		t.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("abc:" + e.getMessage());
			}
		});
		t.start();
	}
}

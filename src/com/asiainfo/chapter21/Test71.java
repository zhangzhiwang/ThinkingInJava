package com.asiainfo.chapter21;

/**
 * 一个非同步的方法被一个同步方法所调用，在调用期间该方法也是同步的
 * 
 * @author zhangzw8
 * @date 2016年4月3日 下午3:18:36
 */
public class Test71 implements Runnable {
	private int i;
	
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("t1")) {
			met1();
		} else {
			met2();
		}
	}
	
	public void met1() {
		i++;
	}
	
	public synchronized void met2(){
		met1();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Test71 t1 = new Test71();
		Test71 t2 = new Test71();
		
		for (int i = 1; i <= 2000; i++) {
			if(i <= 1000) {
				new Thread(t1, "t1").start();
			} else {
				new Thread(t2, "t2").start();
			}
		}
		
		Thread.sleep(3000);
		System.out.println("t1.i = " + t1.i);
		System.out.println("t2.i = " + t2.i);
	}
}

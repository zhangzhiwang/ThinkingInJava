package com.asiainfo.chapter21;

/**
 * 在方法声明里面使用synchronized关键字相当于synchronized(this){}
 * 
 * @author zhangzw8
 * @date 2016年4月3日 下午5:27:25
 */
public class Test75 implements Runnable {
	public void run() {
		if (Thread.currentThread().getName().equals("t1")) {
			met1();
		} else {
			met2();
		}
	}

	public synchronized void met1() {//与met3()等效
		try {
			Thread.sleep(3000);
			System.out.println("met1");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void met2() {
		System.out.println("met2");
		synchronized (this) {
			System.out.println("hello");
		}
	}

	public void met3() {
		synchronized (this) {
			try {
				Thread.sleep(3000);
				System.out.println("met1");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Test75 t = new Test75();
		Thread t1 = new Thread(t, "t1");
		Thread t2 = new Thread(t, "t2");
		t1.start();
		t2.start();
	}
}

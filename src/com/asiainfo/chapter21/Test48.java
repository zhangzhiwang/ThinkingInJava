package com.asiainfo.chapter21;

/**
 * synchronized修饰静态和非静态方法
 * 
 * @author zhangzw8
 * @date 2016年3月30日 下午3:27:40
 */
public class Test48 implements Runnable {
	@Override
	public void run() {
		try {
			String name = Thread.currentThread().getName();
			if (name.equals("t1")) {
				met1();
			} else if (name.equals("t2")) {
				met2();
			} else if (name.equals("t3")) {
				met3();
			} else if (name.equals("t4")) {
				met4();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void met1() throws InterruptedException {
		Thread.currentThread().sleep(2000);
		System.out.println(1);
	}

	public synchronized void met2() {
		System.out.println(2);
	}

	public synchronized static void met3() throws InterruptedException {
		Thread.currentThread().sleep(1000);
		System.out.println(3);
	}

	public synchronized static void met4() {
		System.out.println(4);
	}

	public static void main(String[] args) throws InterruptedException {
		Test48 t = new Test48();
		Thread t1 = new Thread(t, "t1");
		t1.start();
		Thread.sleep(10);
		Thread t2 = new Thread(t, "t2");
		t2.start();
		Thread.sleep(10);
		Thread t3 = new Thread(t, "t3");
		t3.start();
		Thread.sleep(10);
		Thread t4 = new Thread(t, "t4");
		t4.start();
		Thread.sleep(10);
	}
}

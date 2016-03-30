package com.asiainfo.chapter21;

/**
 * synchronized修饰静态方法
 * 
 * @author zhangzw8
 * @date 2016年3月30日 下午3:17:59
 */
public class Test47 extends Thread {
	@Override
	public void run() {
		try {
			if (getName().equals("t1")) {
				met1();
				return;
			}
			if (getName().equals("t2")) {
				met2();
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized static void met1() throws InterruptedException {//synchronized修饰静态方法锁住的是该类的Class对象（即Test47.class），而不是Test47的具体对象
		sleep(3000);
		System.out.println(1);
	}

	public synchronized static void met2() {
		System.out.println(2);
	}
	
	public static void main(String[] args) throws Exception {
		Test47 t = new Test47();
		t.setName("t1");
		Thread t1 = new Thread(t);
		t1.start();
		sleep(10);
		t.setName("t2");
		Thread t2 = new Thread(t);
		t2.start();
	}
}

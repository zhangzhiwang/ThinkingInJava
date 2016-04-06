package com.asiainfo.chapter21;

/**
 * synchronized块在其他对象上同步
 * 
 * @author zhangzw8
 * @date 2016年4月3日 下午5:38:56
 */
public class Test76 implements Runnable {
	public Test75 t75 = new Test75();
	public Object o = new Object();
	public void run() {
		if(Thread.currentThread().getName().equals("t1")) {
			met2();
		} else {
			met3();
		}
	}

	public void met1() {
		synchronized (this) {
			while(true) {}
		}
	}
	
	public void met2() {
		synchronized (this.o) {
//			for(int i = 1; i <= 10; i++) {
//				System.out.println(i);
//			}
			while(true) {}
		}
	}
	
	public void met3() { //met1()、met2()、met3()互不影响，因为他们锁住的不是一个对象
		synchronized (t75) {
			for(int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Test76 t = new Test76();
		Thread t1 = new Thread(t, "t1");
		Thread t2 = new Thread(t, "t2");
		t1.start();
		t2.start();
	}
}

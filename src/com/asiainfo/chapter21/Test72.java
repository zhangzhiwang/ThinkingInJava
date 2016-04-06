package com.asiainfo.chapter21;

/**
 * synchronized关键字并非方法声明里面所必须的，所以如果子类复写父类的方法，如果用子类的对象去调用该方法，该方法是否是同步的取决于子类是否对该方法进行同步，而与父类是在该方法上使用synchronized无关
 * 
 * @author zhangzw8
 * @date 2016年4月3日 下午4:01:32
 */
public class Test72 implements Runnable {
	int i;

	public void run() {
		increment();
	}

	public void increment() {
		i++;
	}

	public static void main(String[] args) throws InterruptedException {
		Test72 t = new Test72();
		Test72_1 t1 = new Test72_1();
		
		for(int i = 1; i <= 2000; i++) {
			if (i <= 1000) {
				new Thread(t).start();
			} else {
				new Thread(t1).start();
			}
		}
		Thread.sleep(3000);
		System.out.println("t.i = " + t.i);
		System.out.println("t1.i = " + t1.i);
	}
}

class Test72_1 extends Test72 {
	public void run() {
		increment();
	}

	public synchronized void increment() {
		i++;
	}
}
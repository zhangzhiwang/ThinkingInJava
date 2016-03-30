package com.asiainfo.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * synchronized放在非静态方法声明里面
 * 
 * @author zhangzw8
 * @date 2016年3月30日 上午9:10:07
 */
public class Test46 extends Thread {
	@Override
	public void run() {
		try {
			if (getName().equals("t1")) {
				met1();
				return;
			}
			
			if (getName().equals("t2")) {
				met2();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Test46() {}
	
	public Test46(String name) {
		super(name);
	}
	
	public synchronized void met1() throws InterruptedException {//synchronized在非静态方法声明里面锁住的当前对象（this）
		sleep(2000);
		System.out.println("met1");
	}

	public synchronized void met2() {
		System.out.println("met2");
	}
	
	public static void main(String[] args) throws InterruptedException {
//		Test46 t1 = new Test46("t1");
//		Test46 t2 = new Test46("t2");
//		t1.start();
//		sleep(10);
//		t2.start();
		/*
		 * 打印结果为：
		 * met2
		   met1
		   原因：线程t1在执行met1()的时候被锁住，锁住的对象是t1；而线程t2在启动后去执行met2()方法，它不用去等待met1()将对象锁释放，因为met1()锁住的对象是t1而不是t2，二者互不干扰。
		 * */
		
		Test46 test = new Test46();
		test.setName("t1");
		Thread t1 = new Thread(test);//注：调用线程类的非静态方法是用该类的对象去调用的，本例中是Test46的test对象去实际执行met1()和met2()方法，而不是Thread的实例t1和t2。t1和t2是两个不同的线程，里面封装了Runnable实现类的同一个对象。
									 //这就是书中为什么要区分线程和任务，线程不执行任何操作，它只是驱动任务去执行操作，它只提供一个平台供任务去运行。
		t1.start();
		sleep(10);
		test.setName("t2");
		Thread t2 = new Thread(test);
		t2.start();
		/*
		 * 打印结果为：
		 * met1
		   met2
		   原因：线程t1在执行met1()的时候被锁住，锁住的对象是test；而线程t2在启动后去执行met2()方法，由于是以哦那个同一个对象去调用，所以线程t2需要等第一个线程将test的锁释放后才能获得该对象的锁从而执行met2()，这里met1()和met2()是同一个对象去访问的
		 * */
	}
}

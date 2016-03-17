package com.asiainfo.chapter21;

/**
 * 在线程类里面建立线程
 * 
 * @author zhangzw8
 * @date 2016年3月17日 下午1:30:45
 */
public class Test2 {
	public static void main(String[] args) {
		Thread t = new Thread(new Test1());//将线程类的对象放到Thread的构造器里面就建立了线程
		t.start();//Thread的start()方法会对线程进行初始化然后调用其对应的线程类的run()方法，这种调用run()方法的方式才是真正启动了一个新线程来执行任务，那么本例才真正是一个多线程程序
		System.out.println("hello");//可以观察输出结果
		//此例还说明一点：建立线程实例不一定在线程类里面，本例Test2就不是一个线程类
	}
}

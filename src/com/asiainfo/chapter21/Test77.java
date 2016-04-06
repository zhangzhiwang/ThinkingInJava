package com.asiainfo.chapter21;

/**
 * 
 * 
 * @author zhangzw8
 * @date 2016年4月3日 下午6:09:39
 */
public class Test77 implements Runnable {
	public Test76 t76;
	public int i;
	public void run() {
		met1();
	}
	
	public void met1() {
		synchronized (t76) {//运行程序会报空指针，被加锁的对象必须已经初始化，而且不能对基本数据类型加锁
			System.out.println("hello");
		}
	}
	public static void main(String[] args) {
		Test77 t = new Test77();
		Thread t1 = new Thread(t);
		t1.start();
	}
}

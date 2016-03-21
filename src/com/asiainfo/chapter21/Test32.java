package com.asiainfo.chapter21;

/**
 * 如何通过interrupt()中断线程
 * 
 * @author zhangzw8
 * @date 2016年3月21日 下午2:05:23
 */
public class Test32 implements Runnable {
	@Override
	public void run() {
		int i = 1;
		while(!Thread.interrupted()) {//检测中断状态。API:测试当前线程是否已经中断。线程的中断状态 由该方法清除。换句话说，如果连续两次调用该方法，则第二次调用将返回 false
			System.out.println(i++);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new Test32());
		t.start();
		Thread.sleep(100);
		t.interrupt();//将中断状态设为true
		System.out.println("----------------" + t.interrupted());//线程中断状态已被第13行代码的interrupted()方法清除
	}
}

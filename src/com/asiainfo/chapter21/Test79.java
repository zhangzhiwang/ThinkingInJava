package com.asiainfo.chapter21;

/**
 * volatile什么时候起作用，详见：http://blog.csdn.net/vking_wang/article/details/9982709
 * 
 * @author zhangzw8
 * @date 2016年4月5日 上午8:55:49
 */
public class Test79 implements Runnable {
	private int num;
	
	public void run() {
		met1();
	}
	
	public void met1() {
		if(Integer.parseInt(Thread.currentThread().getName()) % 2 == 0) {
			num = 2;
		} else {
			num = 1;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Test79 t = new Test79();
		for(int i = 1; i <= 1000; i++) {
			new Thread(t, "" + i).start();
			Thread.sleep(1);
		}
		Thread.sleep(3000);
		System.out.println("t.num = " + t.num);
	}
}

package com.asiainfo.chapter21;

/**
 * 从外面无法捕获run()方法抛出的异常，因为run()方法是间接被调用的
 * 
 * @author zhangzw8
 * @date 2016年3月28日 下午1:06:21
 */
public class Test35 extends Thread {
	public static void main(String[] args) {
		try {//无法捕获从run()方法抛出的异常，try/catch不起作用
			Test35 t = new Test35();
			t.start();
		} catch (Exception e) {
			System.out.println("hello");
			e.printStackTrace();
		}
	}

	public void run() {
		throw new RuntimeException("err:exception!");
	}
}

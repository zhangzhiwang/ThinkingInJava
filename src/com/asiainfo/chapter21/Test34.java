package com.asiainfo.chapter21;

import java.io.IOException;

/**
 * 模拟响应用户界面
 * 
 * @author zhangzw8
 * @date 2016年3月22日 下午3:18:28
 */
public class Test34 {
	public static void main(String[] args) throws IOException {
//		new WithoutThread().met1();//单线程
		
		new WithThread().start();//多线程
		while(true) {
			System.out.println(System.in.read());
		}
	}
}

class WithoutThread {//单线程很难做到响应用户界面同时做到执行其他运算
	public void met1() throws IOException {
		int i = 1;
		while(true) {
			if (i++ % 1000 == 0) {
				System.in.read();
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
}

class WithThread extends Thread {
	@Override
	public void run() {
		int i = 1;
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i++);
		}
	}
}
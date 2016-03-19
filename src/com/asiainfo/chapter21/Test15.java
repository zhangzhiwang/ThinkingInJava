package com.asiainfo.chapter21;

import java.util.concurrent.TimeUnit;

/**
 * 守护线程
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 下午3:29:26
 */
public class Test15 implements Runnable {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			Thread t = new Thread(new Test15());
			t.setDaemon(true);// 设置该线程为守护线程。当所有非守护线程（用户线程）运行结束时程序终止，所有守护线程被kill掉。本例中，如果将本行注掉，那么所有线程都为用户线程，它们将永远无法结束，程序将永远无法停止。
			t.start();
		}
		System.out.println("OK");
		TimeUnit.MILLISECONDS.sleep(1000);// 主线程休眠和不休眠的区别详见p662笔记
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		while (true) {
		}
	}
}

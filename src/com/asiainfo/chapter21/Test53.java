package com.asiainfo.chapter21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月30日 下午9:37:00
 */
public class Test53 extends Thread {
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {

	}

	public void met1() {
		lock.lock();
		try {
			System.out.println("打开资源");
			System.out.println("处理资源");
			String s = null;
			s.length();
			System.out.println("关闭资源");// 线程退出时资源没有关闭
		} finally {
			lock.unlock();
		}
	}
}

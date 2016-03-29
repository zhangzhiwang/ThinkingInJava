package com.asiainfo.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * IntGenerator的线程安全形式
 * 
 * @author zhangzw8
 * @date 2016年3月29日 下午1:46:16
 */
public class Test44 {
	public static void main(String[] args) {
		SyncEvenGenerator seg = new SyncEvenGenerator();
		ExecutorService es = Executors.newCachedThreadPool();
		for (int i = 1; i <= 10; i++) {
			es.execute(new EvenChecker(seg));
		}
	}
}
class SyncEvenGenerator extends IntGenerator {
	private int i;
	
	@Override
	public synchronized int next() {
		i++;
		Thread.currentThread().yield();
		i++;
		return i;
	}
}
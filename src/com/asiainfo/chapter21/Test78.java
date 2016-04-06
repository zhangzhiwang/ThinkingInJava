package com.asiainfo.chapter21;

/**
 * 线程本地存储
 * 
 * @author zhangzw8
 * @date 2016年4月4日 下午12:37:37
 */
public class Test78 {
	private Integer num = new Integer(0);
	
	public static void main(String[] args) throws InterruptedException {
		final Test78 t = new Test78();
		for (int i = 1; i <= 5; i++) {
			new Thread(){
				private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
					@Override
					public Integer initialValue() {
						return t.num;
					}
				};
				
				@Override
				public void run() {
					for (int i = 1; i <= 1000; i++) {
						threadLocal.set(threadLocal.get() + 1);
					}
					System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get());
				}
			}.start();
		}
		Thread.sleep(2000);
		System.out.println("original t.num = " + t.num);
	}
}

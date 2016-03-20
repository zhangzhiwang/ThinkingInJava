package com.asiainfo.chapter21;

/**
 * 将线程的创建和启动放在类的某个方法里面
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月20日 上午11:52:36
 */
public class Test28 {
	public void met1(final String name) {
		new Thread(new Runnable() {
			private Thread t = new Thread(name);

			{
				t.start();
			}

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		}, name).start();
	}

	public void met2() {
	}

	public void met3() {
	}

	public static void main(String[] args) {
		new Test28().met1("hello");
	}
}

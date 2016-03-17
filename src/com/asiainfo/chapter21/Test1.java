package com.asiainfo.chapter21;

/**
 * 定义线程类——只需实现（直接/间接）Runnable接口
 * 
 * @author zhangzw8
 * @date 2016年3月17日 下午1:00:07
 */
public class Test1 implements Runnable {// 判断一个类是否是一个线程类的唯一标准就是该类是否直接或间接地实现了Runnable接口，因此Test1是一个线程类
	@Override
	public void run() {// Runnable只有一个抽象方法——run()，所以实现Runnable接口的类必须实现run()方法
		/*
		 * jdk api: 使用实现接口 Runnable 的对象创建一个线程时，启动该线程将导致在独立执行的线程中调用对象的 run 方法。 方法 run 的常规协定是，它可能执行任何所需的动作。
		 */
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.run();//注意：这种方式（直接调用线程类的run()方法）没有启动一个新线程来运行，这和普通方法调用是一样的，都是在主线程（main()方法）里执行的，所以这是一个单线程程序
		//所以，建立一个线程类或者说运行线程类的run()方法不一定就是多线程程序。判断一个程序是否启动了多个线程（两个及其以上）的关键是看run()方法是怎么被调用的。但一般情况下如果建立了一个线程类是不会用本例的方法来用对象直接调用run()方法的，因为这和非线程类调用普通方法没什么区别。
	}
}

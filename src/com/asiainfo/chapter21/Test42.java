package com.asiainfo.chapter21;

/**
 * 在没有线程特有的未捕获异常处理类的情况下才会调用默认的未捕获异常处理类
 * 
 * @author zhangzw8
 * @date 2016年3月28日 下午2:36:30
 */
public class Test42 implements Runnable {
	@Override
	public void run() {
		throw new RuntimeException("sth.err:" + Thread.currentThread());
	}

	public class DefaultHandler implements Thread.UncaughtExceptionHandler {
		@Override
		public void uncaughtException(Thread t, Throwable th) {
			System.out.println("deafult:" + th.getMessage());
		}
	}

	public class Test42Handler implements Thread.UncaughtExceptionHandler {
		@Override
		public void uncaughtException(Thread t, Throwable th) {
			System.out.println("test42:" + th.getMessage());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread.setDefaultUncaughtExceptionHandler(new Test42().new DefaultHandler());
		Test42 test42 = new Test42();
		Thread t1 = new Thread(test42);
		t1.setUncaughtExceptionHandler(new Test42().new Test42Handler());//给线程t1设置了Test42Handler，则不会调用defaultUncaughtExceptionHandler
		t1.start();
		Thread.sleep(10);
		
		System.out.println("-------------------------");
		Thread t2 = new Thread(test42);//在没有给线程设置特有的未捕获异常处理器的时候测绘调用默认的
		t2.start();
	}
}

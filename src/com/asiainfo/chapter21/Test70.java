package com.asiainfo.chapter21;

/**
 * synchronized语句块和将其放在方法声明里面的效率问题
 * 
 * @author zhangzw8
 * @date 2016年4月3日 下午2:47:47
 */
public class Test70 implements Runnable {
	private int i;
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("t1")) {
			met1();
		} else {
			met2();
		}
	}
	
	public synchronized void met1() {
		for (int i = 1; i <= 100000; i++) {
			double d = (Math.PI + Math.E)/i;
		}
		i++;
	}
	
	public void met2() {
		for (int i = 1; i <= 100000; i++) {
			double d = (Math.PI + Math.E)/i;
		}
		synchronized(this) {//如果一个方法里面只有部分代码需要同步，那么就把这部分代码放到synchronized块里面即可，无需将整个方法同步，这样可以减少对象被锁住的时间从而提高效率
			i++;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Test70 t1 = new Test70();
		Test70 t2 = new Test70();
		
		long start = System.currentTimeMillis();
		for(int i = 1; i <= 1000; i++) {
			Thread t = new Thread(t1, "t1");
			t.start();
			t.join();
		}
		long end = System.currentTimeMillis();
		System.out.println("t1.i　＝　"+ t1.i + ",用时：" + (end - start));
		
		long start2 = System.currentTimeMillis();
		for(int i = 1; i <= 1000; i++) {
			Thread t = new Thread(t2, "t2");
			t.start();
			t.join();
		}
		long end2 = System.currentTimeMillis();
		System.out.println("t2.i　＝　"+ t2.i + ",用时：" + (end2 - start2));
	}
}

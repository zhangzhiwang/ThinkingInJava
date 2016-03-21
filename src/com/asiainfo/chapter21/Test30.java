package com.asiainfo.chapter21;

/**
 * interrupt()
 * 
 * @author zhangzw8
 * @date 2016年3月21日 上午9:23:19
 */
public class Test30 extends Thread {
	public static void main(String[] args) throws InterruptedException {
		Test30 t = new Test30();
		t.start();
		Thread.sleep(100);
		t.interrupt();/* 如果线程在调用 Object 类的 wait()、wait(long) 或 wait(long, int) 方法，或者该类的 join()、join(long)、join(long, int)、sleep(long) 或 sleep(long, int) 方法过程中受阻，则其中断状态将被清除，它还将收到一个 InterruptedException。 */
		System.out.println(t.isInterrupted());//在sleep的过程中被打断，其中断状态被清除，所以此处为false。
		System.out.println("hello");
	}

	@Override
	public void run() {
		try {
			 Thread.currentThread().sleep(3000);
//			while (true) {
//			}
			 System.out.println("after sleep.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("world");
	}

}

package com.asiainfo.chapter21;

/**
 * 基本数据类型的赋值和返回操作不是原子性的
 * 
 * @author zhangzw8
 * @date 2016年4月1日 上午9:47:31
 */
public class Test62 implements Runnable {
	private int i = 0;

	@Override
	public void run() {
		while (true) {
			met1();
		}
	}

	public synchronized void met1() {
		i++;
		i++;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		Test62 t = new Test62();
		new Thread(t).start();
		while(true) {
			int num = t.getI();
			if (num % 2 != 0) {
				System.out.println(num);
			}
		}
	}
}

package com.asiainfo.chapter21;

/**
 * synchronized的缺陷
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月30日 下午9:31:34
 */
public class Test52 extends Thread {
	@Override
	public void run() {
		met1();
	}
	
	public synchronized void met1() {
		System.out.println("打开资源");
		System.out.println("处理资源");
		String s = null;
		s.length();
		System.out.println("关闭资源");//线程退出时资源没有关闭
	}
	
	public static void main(String[] args) {
		new Test52().start();
	}	
}

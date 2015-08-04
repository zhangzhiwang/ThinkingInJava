package com.asiainfo.chapter5;

/**
 * 初始化顺序
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月4日
 */
public class Test15 {
	public static void main(String[] args) {
		House h = new House();
		h.func();
	}
}

class Window {
	public Window(int i) {
		System.out.println("Window:" + i);
	}

	public Window() {
	}
}

class House {
	public Window w1 = new Window(1);

	public House() {
		System.out.println("House()");
		w3 = new Window(33);
	}

	public Window w3 = new Window(3);

	public void func() {
		System.out.println("func()");
	}

	public Window w4;
}
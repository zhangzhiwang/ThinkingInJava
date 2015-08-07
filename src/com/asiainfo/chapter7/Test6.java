package com.asiainfo.chapter7;

/**
 * 初始化基类——在实例化子类对象的时候会首先实例化父类对象
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月7日
 */
public class Test6 extends F {
	public static void main(String[] args) {
		Test6 t = new Test6();
	}

	public Test6() {
		System.out.println("Test6");
	}
}

class F extends G {
	public F() {
		// super();// 默认
		System.out.println("F");
	}
}

class G {
	public G() {
		System.out.println("G");
	}
}
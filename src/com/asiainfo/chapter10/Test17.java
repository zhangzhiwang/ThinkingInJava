package com.asiainfo.chapter10;

/**
 * 子类带参数的构造器默认调用父类的无参构造器
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月20日 下午2:09:45
 */
public class Test17 extends I {
	public Test17() {}
	
	public Test17(int i) {// 默认调用super();而不是super(i);
		System.out.println("Test17(int i)");
	}
	
	public static void main(String[] args) {
		new Test17(1);
	}
}

class I {
	private int i;
	
	public I() {
		System.out.println("I()");
	}
	
	public I(int i) {
		this.i = i;
		System.out.println("I(int i)");
	}
}

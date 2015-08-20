package com.asiainfo.chapter10;

/**
 * 外部类可以访问内部类的private构造器
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月20日 上午9:53:04
 */
public class Test9 {
	class A {
		private A () {}
	}
	
	public static void main(String[] args) {
		Test9 t = new Test9();
		A a = t.new A();
	}
}

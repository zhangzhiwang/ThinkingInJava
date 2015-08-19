package com.asiainfo.chapter10;

/**
 * 外部类对象创建内部类对象——.new
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月19日 下午3:26:38
 */
public class Test5 {
	public class A {}
	
	public static void main(String[] args) {
		Test5 t = new Test5();
		A a = t.new A();// Must use instance of outer class to create an instance of the inner class
	}
}

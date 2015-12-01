package com.asiainfo.chapter11;

/**
 * 多太
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月29日 上午11:54:02
 */
public class Test57 extends D1 {
	public static void main(String[] args) {
		D1 d = new Test57();
		d.func1();// 多太的对象只能访问父类里面所定义的方法（执行的是子类所复写的方法），不能访问子类特有的方法——That's why Queue能够窄化LinkedList方法的访问权限，即能访问的LinkedList方法变少
		// d.func2();//The method func2() is undefined for the type D1
	}

	public void func2() {
	}
}

class D1 {
	public void func1() {
	}
}

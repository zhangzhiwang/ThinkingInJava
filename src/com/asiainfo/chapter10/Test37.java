package com.asiainfo.chapter10;

/**
 * 内部类访问外部类的父类信息
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月25日 上午9:42:40
 */
public class Test37 extends S {
	int i2 = 2;
	class A {
		int i3 = 3;
		public void func1() {
			i1 = 10;
			Test37.this.i1 = 10;
			i2 = 20;
			i3 = 30;
		}
	}
	
	public static void main(String[] args) {
		Test37 t = new Test37();
		A a = t.new A();
//		a.i1 = 1;// 内部类可以访问外部类的信息说的是在内部类里面（因为在内部类里面有.this关键字），这里的a.i1和a.i2是在内部类外面去访问
//		a.i2 = 1;
		a.i3 = 1;
	}
}

class S {
	int i1 = 1;
}
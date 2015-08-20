package com.asiainfo.chapter10;

/**
 * 在任意作用域内嵌入内部类
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月20日 上午10:25:57
 */
public class Test12 {
	public void func1(int i) {
		if(i == 1) {
			class A {
				private int i;
				
				public A(int i) {
					this.i = i;
				}
				
				public A() {}
				
				public void func2() {
					System.out.println("i = " + i);
				}
			}
			
			A a = new A(1);
			a.func2();
		}
//		A a = new A(1);// 超出了A的作用域
	}
	
	public static void main(String[] args) {
		Test12 t = new Test12();
		t.func1(1);
	}
}

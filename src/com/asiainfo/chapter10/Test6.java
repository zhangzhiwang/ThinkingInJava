package com.asiainfo.chapter10;

/**
 * 外部类和内部类可以互相访问private成员（变量和方法）
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月19日 下午4:47:40
 */
public class Test6 {
	private int i1;
	
	private void func1() {}
	
	class Inner {
		private int i2;
		
		private void func2(){}
		
		public void func3() {
			i1 = 1;
			func1();
		}
	}
	
	public static void main(String[] args) {
		Test6 t = new Test6();
		Inner i = t.new Inner();
		System.out.println(i.i2);
		i.func3();
	}
}

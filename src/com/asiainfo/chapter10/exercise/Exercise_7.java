package com.asiainfo.chapter10.exercise;

/**
 * p195练习7
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月19日 下午4:31:01
 */
public class Exercise_7 {
	private int i = 1;
	
	private void func1() {
		System.out.println("Exercise_7.func1()");
	}
	
	public class Inner {
		public void func2() {
//			i = 2;
			Exercise_7.this.i = 2;
			func1();
		}
	}
	
	public static void main(String[] args) {
		Exercise_7 e = new Exercise_7();
		Inner i = e.new Inner();
		System.out.println(e.i);
		i.func2();
		System.out.println(e.i);
	}
}

package com.asiainfo.chapter3;

/**
 * p41练习3
 * 
 * @author zhangzhiwang 2015年7月7日
 */
public class Test3 {
	private float num;

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.num = 1;
		System.out.println("1st. t.num = " + t.num);
		t.func(t);
		System.out.println("2nd. t.num = " + t.num);
	}

	public void func(Test3 t3) {
		t3.num = 2;
	}
}

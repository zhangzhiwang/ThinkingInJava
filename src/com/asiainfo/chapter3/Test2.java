package com.asiainfo.chapter3;

/**
 * p40练习2
 * 
 * @author zhangzhiwang 2015年7月7日
 */
public class Test2 {
	private float num;

	public static void main (String[] args){
		Test2 t1 = new Test2();
		Test2 t2 = new Test2();
		t1.num = 1;
		t2.num = 2;
		System.out.println("t1.num = " + t1.num);
		System.out.println("t2.num = " + t2.num);
		System.out.println("---------------------");
		t1 = t2;
		System.out.println("t1.num = " + t1.num);
		System.out.println("t2.num = " + t2.num);
		System.out.println("---------------------");
		t1.num = 3;
		System.out.println("t1.num = " + t1.num);
		System.out.println("t2.num = " + t2.num);
	}
}

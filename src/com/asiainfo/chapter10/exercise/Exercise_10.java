package com.asiainfo.chapter10.exercise;

/**
 * p196练习10
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月20日 上午10:46:22
 */
public class Exercise_10 {
	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {
			class E1 implements E {
				@Override
				public void func1() {
					System.out.println("Exercise_10.main.E1.func1()");
				}
			}
			E e = new E1();
			e.func1();
		}
	}
}

package com.asiainfo.chapter7.exercise;

/**
 * p142练习18
 * 
 * @author zhangzhiwang 2015年8月9日
 */
public class Exercise_18 {
	private static final int MY_AGE = (int) (Math.random() * 100);
	private final double hisAge = (int) (Math.random() * 100);

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Exercise_18 e1 = new Exercise_18();
			System.out.println(e1.MY_AGE);
			System.out.println(e1.hisAge);
			System.out.println("------------");
		}
	}
}

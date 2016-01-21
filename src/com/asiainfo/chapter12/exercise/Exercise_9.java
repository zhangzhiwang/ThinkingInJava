package com.asiainfo.chapter12.exercise;

/**
 * p257练习9
 * 
 * @author zhangzw8
 * @date 2016年1月21日 下午12:53:25
 */
public class Exercise_9 {

	public static void func1() throws C, D, E {
		System.out.println("func1");
	}

	public static void main(String[] args) {
		try {
			func1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class C extends Exception {
}

class D extends Exception {
}

class E extends Exception {
}
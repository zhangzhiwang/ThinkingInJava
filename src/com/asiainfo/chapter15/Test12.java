package com.asiainfo.chapter15;

/**
 * 方法可返回元组
 *
 * @author zhiwangzhang
 * @date 2016年7月2日 上午10:51:03
 */
public class Test12 {
	public Test10<Integer, Integer> getTwo() {
		return new Test10<Integer, Integer>(1, 2);
	}

	public Test10<String, String> getTwo2() {
		return new Test10<String, String>("hello", "world");
	}

	public Test11_1<Integer, String, Boolean, String, Double> getTest11_1() {
		return new Test11_1<Integer, String, Boolean, String, Double>(1, "abc", true, "def", 2.0);
	}
	
	public static void main(String[] args) {
		Test12 t = new Test12();
		System.out.println(t.getTwo());
		System.out.println(t.getTwo2());
		System.out.println(t.getTest11_1());
	}
}
package com.asiainfo.chapter14.exercise;

/**
 * p318练习7
 * 
 * @author zhangzw8
 * @date 2016年3月9日 下午12:51:02
 */
public class Exercise_7 {
	public static void main(String[] args) throws ClassNotFoundException {
		String s = "com.asiainfo.chapter14.exercise.K";
		met1(s);
	}
	
	public static void met1(String s) throws ClassNotFoundException {
		Class.forName(s);
	}
}

class J {
	static {
		System.out.println("J");
	}
}

class K {
	static {
		System.out.println("K");
	}
}
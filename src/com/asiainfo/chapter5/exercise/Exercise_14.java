package com.asiainfo.chapter5.exercise;

/**
 * p97Á·Ï°14
 * 
 * @author zhangzw8@asiainfo.com\n 2015Äê8ÔÂ5ÈÕ
 */
public class Exercise_14 {
	public static void main(String[] args) {
		Cupboard.func();
	}

}

class Cupboard {
	private static String name = "Tom";
	private static String addr;

	static {
		addr = "123";
	}

	public static void func() {
		System.out.println(name + "\t" + addr);
	}
}

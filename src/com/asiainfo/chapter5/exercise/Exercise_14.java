package com.asiainfo.chapter5.exercise;

/**
 * p97��ϰ14
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��5��
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

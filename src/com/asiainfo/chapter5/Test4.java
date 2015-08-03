package com.asiainfo.chapter5;

/**
 * 方法重载
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月3日
 */
public class Test4 {
	public static void main(String[] args) {
		Test4 t = new Test4();
		t.func(1, "Tom");
		t.func("Jemmy", 2);
		t.fund(3);
	}

	public void func(int age, String name) {
		System.out.println(age + "\t" + name);
	}

	public void func(String name, int age) {
		System.out.println(age + "\t" + name);
	}

	public void fund(int age) {
		System.out.println(age);
	}
}

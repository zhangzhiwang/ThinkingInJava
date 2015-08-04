package com.asiainfo.chapter5;

/**
 * 构造器的一些注意事项
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月4日
 */
public class Test11 {
	private int age;
	private String name;

	public Test11() {
	}

	public Test11(int age) {
		this("Tom");
		// this(age,"Tom");// 在一个构造器内部只能调用一个构造器
	}

	public Test11(String name) {
		this.name = name;
		// this(1,"Tom");// 调用其他构造器的语句必需放在方法的最开始处
	}

	public Test11(int age, String name) {
		this();// 有参构造器可以调用无参构造器，反之亦可
	}

	public void func() {
//		this();// 不能再普通方法中直接调用构造器
	}

}

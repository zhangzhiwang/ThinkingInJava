package com.asiainfo.chapter7.exercise;

/**
 * p129练习3——证明：如果不给子类创建构造器，编译器会默认给其创建一个无参构造器，且该构造器会默认调用父类无参构造器
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月7日
 */
public class Exercise_3 extends H {
	public static void main(String[] args) {
		Exercise_3 e = new Exercise_3();
	}
}

class H {
	public H() {
		System.out.println("H");
	}

	public H(int i) {
		System.out.println("H(int i)");
	}
}
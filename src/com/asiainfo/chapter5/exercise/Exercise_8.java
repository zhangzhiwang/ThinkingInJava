package com.asiainfo.chapter5.exercise;

/**
 * p85练习8
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月4日
 */
public class Exercise_8 {
	public static void main(String[] args) {
		new Exercise_8().func1();
	}

	public void func1() {
		func2();
		this.func2();// 这里只是验证this关键字是其作用的，实际应用时不应显示地在这里添加this关键字，因为编译器会自动添加
	}

	public void func2() {
		System.out.println(1);
	}
}

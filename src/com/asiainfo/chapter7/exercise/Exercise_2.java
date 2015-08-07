package com.asiainfo.chapter7.exercise;

import com.asiainfo.chapter7.Test5;

/**
 * p129Á·Ï°2
 * 
 * @author zhangzw8@asiainfo.com\n 2015Äê8ÔÂ7ÈÕ
 */
public class Exercise_2 extends Test5 {
	public void func2(int i) {
		System.out.println("Exercise_2.func2(int i)");
	}

	public void func4() {
		System.out.println("Exercise_2.func4()");
	}

	public static void main(String[] args) {
		Exercise_2 e = new Exercise_2();
		e.func2(1);
		e.func4();
		e.func1();
	}
}

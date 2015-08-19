package com.asiainfo.chapter10.exercise;

import com.asiainfo.chapter10.exercise.Exercise_8.Inner;

/**
 * p195练习8
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月19日 下午4:37:53
 */
public class Exercise_8 {
	class Inner {
		private int i = 1;
		
		private void func2() {
		}
	}
	
	public static void main(String[] args) {
		Exercise_8 e = new Exercise_8();
		Inner in = e.new Inner();
		System.out.println(in.i);// 外部类可以使用内部类的成员（变量和方法）
		in.func2();
	}
}

class A {
	public void func1() {
		Exercise_8 e = new Exercise_8();
		Inner in = e.new Inner();
//		System.out.println(in.i);// The field Exercise_8.Inner.i is not visible
//		in.func2();// The method func2() from the type Exercise_8.Inner is not visible
	}
}

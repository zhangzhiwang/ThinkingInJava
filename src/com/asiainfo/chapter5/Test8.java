/**
 * 
 */
package com.asiainfo.chapter5;

/**
 * 在方法里返回当前对象的引用
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月4日
 */
public class Test8 {
	private int age;

	public static void main(String[] args) {
		Test8 t = new Test8();
		t.func().func().func();
		System.out.println(t.age);
	}

	public Test8 func() {
		age++;
		return this;
	}

}

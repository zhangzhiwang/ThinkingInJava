/**
 * 
 */
package com.asiainfo.chapter2;

/**
 * 测试类成员变量有默认值，局部变量没有默认值（局部变量不初始化在调用时编译报错）
 * 
 * @author zhangzhiwang
 * 2015年7月4日
 */
public class Test2 {
	int i;

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		int num = 1;
		System.out.println(test2.i);
		System.out.println(num);
	}
}

package com.asiainfo.chapter3;

//import static com.asiainfo.chapter3.Test30.func1;
//import static com.asiainfo.chapter3.Test30.i;
//import static com.asiainfo.chapter3.Test30.num;
import static com.asiainfo.chapter3.Test30.*;// 导入Test30里面的所有静态成员（变量和方法）

/**
 * 静态导入
 * 
 * @author zhangzhiwang 2015年8月9日
 */
public class Test29 {
	static int i = 2;
	
	public static void main(String[] args) {
//		Test30.func1();// 没有静态导入的情况下，要写出类名
//		System.out.println(Test30.i);// 没有静态导入的情况下，要写出类名
		
		System.out.println(i);// 在名称相同的情况下，使用的是本类的成员变量而非静态导入的成员变量
		System.out.println(num);
		
		func1();
//		func2();// 无法调用静态导入类的非静态方法
		func3();// 在名称相同的情况下，使用的是本类的方法而非静态导入的方法
		
		// 关于静态导入，详见http://www.cnblogs.com/mengdd/archive/2013/01/23/2873312.html
	}
	
	public static void func3() {
		System.out.println("Test29.func3()");
	}
}

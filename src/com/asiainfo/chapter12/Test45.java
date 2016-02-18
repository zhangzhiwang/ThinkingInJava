package com.asiainfo.chapter12;

/**
 * 方法调用抛出异常的情况
 * 
 * @author zhangzw8
 * @date 2016年2月18日 上午9:47:52
 */
public class Test45 {
	public static void main(String[] args) throws J {
		func1();//方法的调用方不能比被调用方抛出更少的异常，子类的构造方法不能比所调的那个父类构造方法所抛异常少就是这个道理
	}
	
	public static void func1() throws J {}
}

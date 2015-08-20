package com.asiainfo.chapter10;

/**
 * 在任意作用域内嵌入内部类
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月20日 上午10:30:55
 */
public class Test13 {
	private int i;
	
	{
		i =1;
		class A1 extends A {}// 代码块里A对A1是可见的
	}
	
	class A {}
	
//	class A2 extends A1 {}// 超出了A1的作用域
	
}

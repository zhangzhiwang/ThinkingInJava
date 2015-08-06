package com.asiainfo.chapter6;

/**
 * 具有包访问权限的类
 * 
 * @author zhangzhiwang 2015年8月6日
 */
class Test9 {
	public static int i = 1;
}

class Car10 {
	public void func() {
		Test9 t = new Test9();
		System.out.println(Test9.i);
	}
}
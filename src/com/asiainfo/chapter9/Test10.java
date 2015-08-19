package com.asiainfo.chapter9;

/**
 * 接口的属性默认都是public static final的，方法默认是public abstract的
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月17日 下午2:33:46
 */
public interface Test10 {
	int age = 1;
	
	void func1();// 没有方法体，证明接口的方法默认是abstract的
}

class Car9 {
	public void func2() {
		System.out.println(Test10.age);// 证明接口的属性默认是static的
//		Test10.age = 2;// The final field Test10.age cannot be assigned 证明接口的属性默认是final的
		// 测试接口的属性和方法默认是public的需要在包外测试
	}
}
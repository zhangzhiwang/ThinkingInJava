package com.asiainfo.chapter10;

/**
 * 实现类可以直接实例化接口中的内部类
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 下午5:49:06
 */
public class Test36 implements R {
	public static void main(String[] args) {
		A a = new A();
		a.func1();
	}
}

interface R {
	class A {
		public void func1() {}
	}
}

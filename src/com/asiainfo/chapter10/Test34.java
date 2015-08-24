package com.asiainfo.chapter10;

/**
 * 接口中的内部类
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 下午5:14:56
 */
public interface Test34 {
	void func1();
	
	class A implements Test34{
		@Override
		public void func1() {
			System.out.println("Test34.A.func1()");
		}
	}
}

class N {
	public static void main(String[] args) {
		Test34 a = new Test34.A();
		a.func1();
	}
}
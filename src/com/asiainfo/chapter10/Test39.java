package com.asiainfo.chapter10;

/**
 * 对于实现多个接口来说，用单个类和内部类的效果是一样的
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月25日 上午10:17:11
 */
public class Test39 implements U {// Test39和W的效果是一样的
	@Override
	public void func1() {}
	
	class A implements V {
		@Override
		public void func2() {}
		
		public void func3() {
			func1();// 相当于A实现了U和V
			func2();
		}
	}
	
	public static void main(String[] args) {
		Test39 t = new Test39();
		t.func1();
		A a = t.new A ();
		a.func2();// 相当于Test39实现了U和V，只不过调用的对象一个是外围类的实例一个是内部类的实例
	}
}

interface U {
	void func1();
}

interface V {
	void func2();
}

class W implements U, V {
	@Override
	public void func1() {}
	
	@Override
	public void func2() {}
}
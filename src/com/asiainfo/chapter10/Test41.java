package com.asiainfo.chapter10;

/**
 * 回调
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月25日 下午2:50:20
 */
public class Test41 extends Z {
	@Override
	public void func1() {
		System.out.println("Test41.func1()");
	}
	
	class A implements Y {
		@Override
		public void func1() {
			Test41.this.func1();// 内部类和外围类方法重名
			System.out.println("Test41.A.func1()");
		}
	}
	
	public static void main(String[] args) {
		Callback[] cbs = { new Callback(new Y1()), new Callback(new Test41().new A()) };
		for(Callback c : cbs) {
			c.run();
		}
	}
}

interface Y {
	void func1();
}

class Y1 implements Y {
	@Override
	public void func1() {
		System.out.println("Y1.func1()");
	}
}

class Z {
	public void func1() {
		System.out.println("Z.func1()");
	}
}

class Callback {
	Y y;
	
	public Callback(Y y) {
		this.y = y;
	}
	
	public void run() {
		y.func1();
	}
}
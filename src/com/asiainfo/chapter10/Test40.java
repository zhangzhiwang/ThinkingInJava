package com.asiainfo.chapter10;

/**
 * 内部类可以实现在一个类里面调用同一个接口的不用实现的效果
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月25日 上午10:35:27
 */
public class Test40 implements X {
	// 一个类实现了一个接口，那么该类有且只有该接口的一种实现，而内部类可以达到该类具有该接口不同实现的效果
	@Override
	public void add () {
		System.out.println("add 1");
	}
	
//	@Override
//	public void add () {// Test40实现了接口X，对于接口方法add，在实现类Test40里面只能有一种实现，即要么“加1”要么“加2”，不能既“加1”又“加2”
//		System.out.println("add 2");
//	}
	
	// 内部类可以实现让Test40实现既“加1”又“加2”还“加3”，即内部类可以让接口的同一个方法在一个类内部有不同实现
	class A implements X {
		@Override
		public void add() {
			System.out.println("add 2");
		}
	}
	
	class B implements X {
		@Override
		public void add() {
			System.out.println("add 3");
		}
	}
	
	public static void main(String[] args) {
		Test40 t = new Test40();
		t.add();
		t.new A().add();// 只不过对于“加2”和“加3”不是通过Test40的实例直接操作的，而是通过其内部类A和B的实例来操作的
		t.new B().add();
	}
}

interface X {
	void add();
}

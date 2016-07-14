package com.asiainfo.chapter15;

/**
 * 继承类和接口的顺序
 * 
 * @author zhangzw8
 * @date 2016年7月14日 上午8:53:56
 */
//public class Test64 implements Test64_1 extends Test64_2 {
public class Test64 extends Test64_2 implements Test64_1 {//定义类时，先继承再实现
	@Override
	public void m1() {}
}
interface Test64_1 {
	String NAME = "hello";
	void m1();
}

class Test64_2 {
	public int num;
	
	public void m2() {}
}

class Test64_4 {}

interface Test64_5 {}

//class Test64_3<T extends Test64_1 & Test64_2> {}

class Test64_3<T extends Test64_2 & Test64_1> {//再定义泛型边界时，继承类和实现接口的顺序和类定义是一样的，即extends class first,then implements interface
	private T t;
	public Test64_3() {}
	
	public Test64_3(T t) {
		this.t = t;
	}
	
	public void m3() {
		t.m1();
		t.m2();
		int i = t.num;
		String s = t.NAME;
	}
}

//class Test64_6<T extends Test64_2 & Test64_4> {}//泛型T不能继承多个类

class Test64_6<T extends Test64_1 & Test64_5> {}//泛型T可以实现多个接口

class Test64_7<T extends Test64_4 & Test64_1 & Test64_5> {}//单继承多实现



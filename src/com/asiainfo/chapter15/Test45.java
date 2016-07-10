package com.asiainfo.chapter15;

/**
 * 擦除——使用泛型并不是强制的
 *
 * @author zhiwangzhang
 * @date 2016年7月9日 下午6:38:20
 */
public class Test45<T> {
	private T t;//T视为Object

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		Test45_2 t = new Test45_2();
		Object o = t.getT();
		t.setT(o);//Type safety: The method setT(Object) belongs to the raw type Test45. References to generic type Test45<T> should be parameterized  想一想：为什么get()不报警告错而set()报警告
	}
}

class Test45_1<T> extends Test45<T> {}

class Test45_2 extends Test45 {}
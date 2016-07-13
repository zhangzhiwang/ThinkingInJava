package com.asiainfo.chapter15;

/**
 * 泛型实例化方法四——模板方法模式？
 *
 * @author zhiwangzhang
 * @date 2016年7月12日 下午10:35:47
 */
public abstract class Test55<T> {
	private T t;

	public Test55() {
		t = next();
	}

	public abstract T next();

	public static void main(String[] args) {
		Test55_1 t = new Test55_1();
		System.out.println(t.getClass().getSimpleName());
	}
}

class Test55_1 extends Test55<Test55_1_1> {
	@Override
	public Test55_1_1 next() {
		return new Test55_1_1();
	}
}

class Test55_1_1 {
}
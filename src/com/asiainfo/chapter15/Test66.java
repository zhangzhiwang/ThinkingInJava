package com.asiainfo.chapter15;

/**
 * 在继承的每个层次上添加泛型边界
 *
 * @author zhiwangzhang
 * @date 2016年7月14日 下午6:41:01
 */
public class Test66<T> {
	public T t;
	
	public Test66() {}
	
	public Test66(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		Test66_3<AA> test = new Test66_3<AA>(new AA());
		AA aa = test.t;
		aa.d();
		aa.e();
		aa.f();
	}
}

class D {
	public void d() {}
}

interface E {
	void e();
}

interface F {
	void f();
}

class AA extends D implements E, F {
	@Override
	public void e() {}
	
	@Override
	public void f() {}
}

class Test66_1<T extends D> extends Test66<T> {
	public Test66_1() {}
	
	public Test66_1(T t) {
		super(t);
		t.d();
	}
}

//class Test66_2<T> extends Test66_1<T> {}//Bound mismatch: The type T is not a valid substitute for the bounded parameter <T extends D> of the type Test66_1<T>

//class Test66_2<T> extends Test66_1<T extends D>{}//Syntax error on token "extends", , expected

//class Test66_2<T extends D> extends Test66_1<T extends D> {}//Syntax error on token "extends", , expected

class Test66_2<T extends D & E> extends Test66_1<T> {//注意写法
	public Test66_2() {}
	
	public Test66_2(T t) {
		super(t);
		t.d();
		t.e();
	}
}

class Test66_3<T extends D & E & F> extends Test66_2<T> {
	public Test66_3() {}
	
	public Test66_3(T t) {
		super(t);
		t.d();
		t.e();
		t.f();
	}
}
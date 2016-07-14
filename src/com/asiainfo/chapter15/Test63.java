package com.asiainfo.chapter15;

/**
 * 边界
 * 
 * @author zhangzw8
 * @date 2016年7月14日 上午8:37:56
 */
public class Test63<T extends Test63_1> {
	private T t;
	
	public void m3() {
		t.m1();
	}
}

class Test63_1 {
	public void m1() {}
}

class Test63_1_1 extends Test63_1 {
	public void m2() {}
}

class Test63_2<T> {
	private T t;
	public void m4() throws InterruptedException {
		t.wait();//无界泛型T能调用的方法是Object能调用的方法，说明泛型泛型擦除到边界为止，若无边界则擦除到Object
	}
}
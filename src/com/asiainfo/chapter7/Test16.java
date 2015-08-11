package com.asiainfo.chapter7;

/**
 * final参数
 * 
 * @author zhangzhiwang 2015年8月9日
 */
public class Test16 {

	public int func1(final int i) {
		// i++;// final参数只能使用不能更改
		return i + 1;
	}

	public void func2(final Car2 c) {
		System.out.println(c.i);
		c.i++;
		System.out.println(c.i);
	}

	public static void main(String[] args) {
		Test16 t = new Test16();
		System.out.println(t.func1(100));
		t.func2(new Car2());
	}
}

class Car2 {
	int i;
}
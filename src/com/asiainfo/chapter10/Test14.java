package com.asiainfo.chapter10;

/**
 * 匿名内部类
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月20日 上午11:18:57
 */
public class Test14 {
	public F getF() {
		return new F() {
			private int i = 1;

			@Override
			public int func1() {
				return i;
			}
		};
	}

	public static void main(String[] args) {
		Test14 t = new Test14();
		F f = t.getF();
		System.out.println(f.func1());
	}
}

interface F {
	int func1();
}

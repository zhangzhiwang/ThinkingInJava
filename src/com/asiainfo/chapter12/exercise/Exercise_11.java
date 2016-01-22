package com.asiainfo.chapter12.exercise;

/**
 * p263练习11
 * 
 * @author zhangzw8
 * @date 2016年1月22日 下午1:27:02
 */
public class Exercise_11 {
	public static void main(String[] args) throws Exception {
		f();
	}

	public static void f() throws Exception {
		try {
			g();
		} catch (F f) {
			throw new RuntimeException(f);
		}
	}

	public static void g() throws F {
		throw new F();
	}
}

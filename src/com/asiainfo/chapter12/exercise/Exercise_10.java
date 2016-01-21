package com.asiainfo.chapter12.exercise;

/**
 * p263练习10
 *
 * @author Zhiwang Zhang
 * @date 2016年1月21日 下午7:13:44
 */
public class Exercise_10 {
	public static void main(String[] args) throws Exception {
		f();
	}

	public static void f() throws Exception {
		try {
			g();
		} catch (F f) {
			throw new G();
		}
	}

	public static void g() throws F {
		throw new F();
	}
}

class F extends Exception {
}

class G extends Exception {

}
package com.asiainfo.chapter8;

/**
 * 向下转型
 * 
 * @author zhangzhiwang
 * @date 2015年8月15日 下午4:55:54
 */
public class Test10 {
	public static void main(String[] args) {
		Test10 t1 = new Test10();
//		R r1 = (R) t1;// java.lang.ClassCastException: com.asiainfo.chapter8.Test10 cannot be cast to com.asiainfo.chapter8.R
		Test10 t2 = new R();
		R r2 = (R) t2;
	}

	public void func1() {
	}
}

class R extends Test10 {
	@Override
	public void func1() {
	}

	public void func2() {
	}
}
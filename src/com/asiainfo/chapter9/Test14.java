package com.asiainfo.chapter9;

/**
 * 接口的继承
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月18日 下午3:07:10
 */
public class Test14 implements L {
	@Override
	public void func3() {
	}

	@Override
	public void func1() {
	}

	@Override
	public void func2() {
	}
}

interface J {
	void func1();
}

interface K {
	void func2();
}

interface L extends J, K {
	void func3();
}
package com.asiainfo.chapter9.exercise;

/**
 * p180练习13
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月18日 下午2:45:12
 */
public class Exercise_13 {

}

interface G {
	void func1();
}

interface G1 extends G {
	void func2();
}

interface G2 extends G {
	void func3();
}

interface G1122 extends G1, G2 {
	void func4();
}

class H implements G1122 {
	@Override
	public void func1() {
	}

	@Override
	public void func2() {
	}

	@Override
	public void func3() {
	}

	@Override
	public void func4() {
	}
}

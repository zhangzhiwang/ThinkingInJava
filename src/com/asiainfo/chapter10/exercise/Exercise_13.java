package com.asiainfo.chapter10.exercise;

/**
 * p199练习13
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 下午2:18:58
 */
public class Exercise_13 {
	public B getB() {
		return new B() {
			@Override
			public void func1() {}
		};
	}
}

interface B {
	void func1();
}
package com.asiainfo.chapter10.exercise;

/**
 * 
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 下午2:57:45
 */
public class Exercise_15 {
	public C getC(int i) {
		return new C(i) {};
	}
}

class C {
	public C(int i) {
		System.out.println("C(int i)");
	}
}

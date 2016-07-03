package com.asiainfo.chapter15.exercise;

/**
 * p363练习12
 *
 * @author zhiwangzhang
 * @date 2016年7月3日 下午1:01:26
 */
public class Exercise_12 {
	public <T> T m1() {
		return null;
	}
	
	public static <U> U m2() {
		return null;
	}
	
	public void m3(String s) {}
	
	public void m4() {
		m3("");
		m3(this.<String>m1());
		m3(new Exercise_12().<String>m1());
		m3(Exercise_12.<String>m2());
	}
}

class Exercise_12_1 {
	public void m() {
		Exercise_12 e = new Exercise_12();
		e.m3("");
		e.m3(e.<String>m1());
		e.m3(Exercise_12.<String>m2());
	}
}

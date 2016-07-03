package com.asiainfo.chapter15.exercise;

/**
 * p362练习10
 *
 * @author zhiwangzhang
 * @date 2016年7月3日 上午10:35:41
 */
public class Exercise_10 {
	public <A, B> void m(A a, String s) {
		System.out.println(s + ":" + a.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		Exercise_10 e = new Exercise_10();
		e.m(true, "hello");
	}
}

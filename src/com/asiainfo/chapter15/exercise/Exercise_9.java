package com.asiainfo.chapter15.exercise;

/**
 * p362练习9
 *
 * @author zhiwangzhang
 * @date 2016年7月3日 上午10:26:28
 */
public class Exercise_9 {
	public <A,B,C, D> void m(A a, B b, C c) {
		System.out.println(a.getClass().getSimpleName() + "," + b.getClass().getSimpleName() + "," + c.getClass().getSimpleName());
	}
	
	public static void main(String[] args) {
		Exercise_9 e = new Exercise_9();
		e.m(1, 1.2, true);
		System.out.println("--------");
		e.m("hello", 'a', e);
	}
}

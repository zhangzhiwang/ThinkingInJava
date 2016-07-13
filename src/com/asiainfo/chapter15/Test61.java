package com.asiainfo.chapter15;

/**
 * 擦除以及擦除到边界
 *
 * @author zhiwangzhang
 * @date 2016年7月13日 下午9:18:16
 */
public class Test61<T> {
	private T t;
	
	public Test61() {}
	
	public Test61(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		Test61<Integer> test = new Test61<Integer>(1);
		System.out.println(test.t.getClass());//T不适被擦除了吗，为什么T的类型不适Object？为什么Test60的T[]的类型是Object[]？
	}
}

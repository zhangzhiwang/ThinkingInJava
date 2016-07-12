package com.asiainfo.chapter15;

/**
 * 泛型实例化方法二——外面实例化好后传进来
 *
 * @author zhiwangzhang
 * @date 2016年7月12日 下午10:24:50
 */
public class Test53<T> {
	private T t;
	
	public Test53() {}
	
	public Test53(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		Test53<Test53_1> test = new Test53<Test53_1>(new Test53_1());
		System.out.println(test.t.getClass().getSimpleName());
	}
}

class Test53_1 {}
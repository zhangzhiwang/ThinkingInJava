package com.asiainfo.chapter15.exercise;

/**
 * p383练习23
 * 
 * @author zhangzw8
 * @date 2016年7月13日 上午9:36:07
 */
public class Exercise_23<T> {
	private T t;
	
	public Exercise_23() {}
	
	public Exercise_23(Generator1<T> gen, int num) {
		t = gen.next(num);
	}
	
	public static void main(String[] args) {
		Exercise_23<String> e = new Exercise_23<String>(new Generator1<String>(){
			@Override
			public String next(int num) {
				return "hello";
			}
		}, 12);
		System.out.println(e.t);
	}
}

interface Generator1<T> {
	T next(int i);
}
package com.asiainfo.chapter10.exercise;

/**
 * p196练习9
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月20日 上午10:37:44
 */
public class Exercise_9 {
	public E getE() {
		class E1 implements E {
			@Override
			public void func1() {
				System.out.println("Exercise_9.getE().E1.func1()");
			}
		}
		return new E1();
	}
	
	public static void main(String[] args) {
		Exercise_9 e = new Exercise_9();
		e.getE().func1();
	}
}

interface E {
	void func1();
}
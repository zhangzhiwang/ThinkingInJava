package com.asiainfo.chapter12.exercise;

/**
 * p276练习25
 * 
 * @author zhangzw8
 * @date 2016年2月18日 上午9:36:18
 */
public class Exercise_25 {
	public static void main(String[] args) throws K {
		Father f = new Grandson();
		f.func1();//对与方法覆盖，子类不能抛出比父类更多的异常就是为了保证多态
	}
}

class K extends Exception {}

class K1 extends K {}

class K11 extends K1{}

class Father {
	public void func1() throws K {}
}

class Son extends Father {
	@Override
	public void func1() throws K1 {}
}

class Grandson extends Son {
	@Override
	public void func1() throws K11 {}
}
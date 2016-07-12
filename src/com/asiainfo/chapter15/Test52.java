package com.asiainfo.chapter15;

/**
 * 用不用泛型的区别
 *
 * @author zhiwangzhang
 * @date 2016年7月12日 下午10:03:59
 */
public class Test52 {
	public Test52_1 m1(Test52_1 t) {
		return t;
	}
	
	public <T extends Test52_1> T m2(T t) {//m1()与m2()有什么区别？
		return t;
	}
	
	public static void main(String[] args) {
		Test52 t = new Test52();
		Test52_1_1 t1 = (Test52_1_1) t.m1(new Test52_1_1());
		Test52_1_1 t2 = t.m2(new Test52_1_1());//区别就是一个需要转型，一个不需要转型。对于m1()来说，入參可以是Test52_1的一个实现类（比如Test52_1_1）而出参可以是另一个实现类（比如Test52_1_2）；而m2()，入參和出参必须是同一个Test52_1的实现类
	}
}

interface Test52_1 {}

class Test52_1_1 implements Test52_1 {}
class Test52_1_2 implements Test52_1 {}
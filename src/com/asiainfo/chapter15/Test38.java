package com.asiainfo.chapter15;

import java.lang.reflect.Method;

/**
 * 反射的三个常用方法
 * 
 * @author zhangzw8
 * @date 2016年7月7日 上午8:39:36
 */
public class Test38 {
	public static void main(String[] args) {
		Method[] ms = Test38_2.class.getMethods();//获取该类及其父类（接口）的所有public方法，注：这里的父类是指多级父类，向上一直到Object
		for (Method m : ms) {
			System.out.print(m.getName() + "\t");
		}
		System.out.println();
		Method[] ms2 = Test38_2.class.getDeclaredMethods();//获取该类所有方法
		for (Method m : ms2) {
			System.out.print(m.getName() + "\t");
		}
		System.out.println();
		Class[] is = Test38_2.class.getInterfaces();//返回该类或接口所直接实现的接口，如果该类是一个普通的类，那么获得的结果不包括该类的父类
		for(Class c : is) {
			System.out.print(c.getSimpleName() + "\t");
		}
	}
}

class Test38_1 {
	public void m1() {}
	
	protected void m2() {}
	
	void m3() {}
	
	private void m4() {}
}

class Test38_2 extends Test38_1 implements Test38_3 {
	public void f1() {}
	
	protected void f2() {}
	
	void f3() {}
	
	private void f4() {}
}

interface Test38_3 extends Test38_4 {}

interface Test38_4 {}
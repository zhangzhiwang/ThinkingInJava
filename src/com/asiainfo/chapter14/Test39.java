package com.asiainfo.chapter14;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Method的setAccessible()方法，反应java反射机制的强大之处之一——反射可以访问类的私有方法
 * 
 * @author zhangzw8
 * @date 2016年3月16日 下午1:39:50
 */
public class Test39 {
	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		T t = new T();
		// t.met1();//The method met1() from the type T is not visible
		t.met2();

		Method m1 = T.class.getDeclaredMethod("met1");
		m1.setAccessible(true);
		m1.invoke(t);
	}
}

class T {
	private void met1() {
		System.out.println("met1");
	}

	public void met2() {
		System.out.println("met2");
	}
}
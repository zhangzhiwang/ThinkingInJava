package com.asiainfo.chapter14;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Method的invoke(Object obj, Object... args)方法——对带有指定参数的指定对象调用由此 Method 对象表示的底层方法。
 * 
 * @author zhangzw8
 * @date 2016年3月16日 下午1:32:37
 */
public class Test38 {
	public void met1() {
		System.out.println("met1");
	}

	public void met2(String s, int i) {
		System.out.println("met2");
	}
	
	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Method m1 = Test38.class.getDeclaredMethod("met1");
		m1.invoke(new Test38());
		Method m2 = Test38.class.getDeclaredMethod("met2", String.class, int.class);
		m2.invoke(new Test38(), "hello", 1);
	}
}

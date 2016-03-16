package com.asiainfo.chapter14;

import java.lang.reflect.Field;

/**
 * java反射机制的强大之处之四——反射可以访问类的私有属性
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月16日 下午7:59:09
 */
public class Test42 {
	public static void main(String[] args) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		W w = new W();
		// System.out.println(w.i);//The field W.i is not visible
		Field f1 = w.getClass().getDeclaredField("i");
		f1.setAccessible(true);
		System.out.println(f1.getInt(w));
		f1.setInt(w, 2);
		System.out.println(f1.getInt(w));
		
		Field f2 = w.getClass().getDeclaredField("S");
		f2.setAccessible(true);
		System.out.println(f2.get(w));
		f2.set(w, "world");//书中说不能修改final值，但测试结果修改了
		System.out.println(f2.get(w));
		
		Field f3 = w.getClass().getDeclaredField("name");
		f3.setAccessible(true);
		System.out.println(f3.get(w));
		f3.set(w, "def");
		System.out.println(f3.get(w));
	}
}

class W {
	private int i = 1;
	private final String S = "hello";
	private String name = "abc";
}
package com.asiainfo.chapter15.exercise;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * p383练习22
 * 
 * @author zhangzw8
 * @date 2016年7月13日 上午9:05:33
 */
public class Exercise_22<T> {
	private T t;
	
	public Exercise_22() {}
	
	public Exercise_22(Class<T> cla, int num) throws SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		Constructor<T> con = cla.getConstructor(int.class);
		t = con.newInstance(num);
	}
	
	public static void main(String[] args) throws SecurityException, IllegalArgumentException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
		Exercise_22<Exercise_22_1> e = new Exercise_22<Exercise_22_1>(Exercise_22_1.class, 1);
	}
}


class Exercise_22_1 {
	public Exercise_22_1() {}
	
	public Exercise_22_1(int i) {
		System.out.println(i);
	}
}
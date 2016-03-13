package com.asiainfo.chapter14.exercise;

import java.lang.reflect.InvocationTargetException;

/**
 * p337练习19
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月13日 下午3:09:24
 */
public class Exercise_19 {
	public Exercise_19() {}
	
	public Exercise_19(int i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Exercise_19.class.getConstructor(int.class).newInstance(1);
	}
}

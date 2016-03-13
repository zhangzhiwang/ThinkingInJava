package com.asiainfo.chapter14.exercise;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * p337练习17
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月13日 下午3:03:13
 */
public class Exercise_17 {
	public static void main(String[] args) throws ClassNotFoundException {
		Pattern p = Pattern.compile("(\\w+\\.)|(native)|(final)");
		String s = "com.asiainfo.chapter14.Test28";
		Class c = Class.forName(s);
		Method[] ms = c.getMethods();
		Constructor[] cs = c.getConstructors();
		for (Method m : ms) {
			System.out.println(p.matcher(m.toString()).replaceAll(""));
		}
		System.out.println("----------------------");
		for (Constructor constructor : cs) {
			System.out.println(constructor);
		}
	}
}

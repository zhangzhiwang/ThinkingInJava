package com.asiainfo.chapter14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * 类方法提取器
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月13日 下午2:45:59n
 */
public class Test28 {
	public static void main(String[] args) throws ClassNotFoundException {
		Pattern.compile("");
		String s = "com.asiainfo.chapter14.Test28";
		Class c = Class.forName(s);
		Method[] ms = c.getMethods();
		Constructor[] cs = c.getConstructors();
		for (Method m : ms) {
			System.out.println(m);
		}
		System.out.println("----------------------");
		for (Constructor constructor : cs) {
			System.out.println(constructor);
		}
	}
}

class P {
	public void met1() {}
	
	public int met2() {
		return 0;
	}
}
package com.asiainfo.chapter14;

import java.util.Arrays;

/**
 * Class的getInterfaces()和getSuperClass()方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月8日 下午8:37:48
 */
public class Test4 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class f1c = Class.forName("com.asiainfo.chapter14.F1");
		Class[] cs = f1c.getInterfaces();//获取该类所实现的那些接口的Class对象，不包括该类的父类
		System.out.println(Arrays.toString(cs));
		Class c = f1c.getSuperclass();//获取父类的Class对象，不包括接口
		System.out.println(c.getSimpleName());
	}
}

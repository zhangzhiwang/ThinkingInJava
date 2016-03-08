package com.asiainfo.chapter14;

import java.util.Arrays;

/**
 * Class的一些常用方法
 * 
 * @author zhangzw8
 * @date 2016年3月8日 上午9:29:10
 */
public class Test3 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz = Class.forName("com.asiainfo.chapter14.Test1");
		String name = clazz.getName();// 获取类（指具体的类）的完整名称——包名.类名
		System.out.println(name);
		String simpleName = clazz.getSimpleName();// 获取类的简单名称（去掉包名的单纯类名）
		System.out.println(simpleName);
		String canonicalName = clazz.getCanonicalName();// 获取规范化名称
		System.out.println(canonicalName);
		System.out.println("----------------------------");
		// 对于数组，getName()和getCanonicalName()返回的名称格式不一样，可详见api
		String[][] ss = new String[1][];
		System.out.println(ss.getClass().getName());
		System.out.println(ss.getClass().getCanonicalName());
		System.out.println(clazz.isInterface());
		System.out.println(ss.getClass().isInterface());
		System.out.println(Class.forName("com.asiainfo.chapter14.C")
				.isInterface());
		System.out.println("-----------------------------");

		Class c1 = Class.forName("com.asiainfo.chapter14.F");
		Class[] cs = c1.getInterfaces();// 详见api
		System.out.println(Arrays.toString(cs));

		Class c2 = Class.forName("com.asiainfo.chapter14.E");
		Class[] cs2 = c2.getInterfaces();
		System.out.println(Arrays.toString(cs2));

		Class c3 = Class.forName("com.asiainfo.chapter14.F1");
		Class[] cs3 = c3.getInterfaces();
		System.out.println(Arrays.toString(cs3));
		System.out.println("----------------------------");

		Class c4 = Class.forName("com.asiainfo.chapter14.F1");
		Class c5 = c4.getSuperclass();// 获取父类的Class对象，如果该类是个接口则返回null，详见api
		System.out.println(c5.getSimpleName());
		
		Class c6 = Class.forName("com.asiainfo.chapter14.E");
		Class c7 = c6.getSuperclass();
		System.out.println(c7);
		System.out.println("-------------------------");
		
		Class c8 = Class.forName("com.asiainfo.chapter14.Test3");
		c8.newInstance();
	}
	
	public Test3 () {
		System.out.println("hello");
	}
}

interface C {
}

interface D {
}

interface E extends D {
}

class F implements C, D {
}

class F1 extends F implements C, D{
}
package com.asiainfo.chapter14;

/**
 * Class的一些常用方法
 * 
 * @author zhangzw8
 * @date 2016年3月8日 上午9:29:10
 */
public class Test3 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("com.asiainfo.chapter14.Test1");
		String name = clazz.getName();//获取类（指具体的类）的完整名称——包名.类名
		System.out.println(name);
		String simpleName = clazz.getSimpleName();//获取类的简单名称（去掉包名的单纯类名）
		System.out.println(simpleName);
		String canonicalName = clazz.getCanonicalName();//获取规范化名称
		System.out.println(canonicalName);
		System.out.println("----------------------------");
		//对于数组，getName()和getCanonicalName()返回的名称格式不一样，可详见api
		String[][] ss = new String[1][];
		System.out.println(ss.getClass().getName());
		System.out.println(ss.getClass().getCanonicalName());
		System.out.println(clazz.isInterface());
		System.out.println(ss.getClass().isInterface());
		System.out.println(Class.forName("com.asiainfo.chapter14.C").isInterface());
	}
}
interface C {}

interface D {}

class E {}
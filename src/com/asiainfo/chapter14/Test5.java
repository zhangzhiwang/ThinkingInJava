package com.asiainfo.chapter14;

/**
 * 类字面常量
 * 
 * @author zhangzw8
 * @date 2016年3月9日 下午1:39:24
 */
public class Test5 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c1 = Class.forName("com.asiainfo.chapter14.Test5");
		Class c2 = Test5.class;//类字面常量能在编译期发现类型错误，不用抛异常；而Class.forName()是在运行期才会发现类型错误，抛出ClassNotFoundException，所以类字面常量更高效
		
		//字面常量可以：
//		Class c3 = Class.forName("int[]");//不能应用与基本数据类型、void、数组
		Class c4 = int.class;//类字面常量可应用于基本数据类型
		Class c5 = double.class;
		Class c6 = void.class;//类字面常量可应用于void
		Class c7 = int[].class;//类字面常量可应用于数组
		Class c8 = String[].class;
		
//		Class c9 = A.class;//类字面常量不会导致类加载
		Class c10 = Class.forName("com.asiainfo.chapter14.A");//Class.forName()会导致类的加载
	}
}
 interface J {}
 
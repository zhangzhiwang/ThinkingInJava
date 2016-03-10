package com.asiainfo.chapter14;

/**
 * 导致类初始化的几种情形
 * 
 * @author zhangzw8
 * @date 2016年3月10日 上午8:38:16
 */
public class Test6 {
	public static void main(String[] args) throws ClassNotFoundException {
//		Class c1 = K.class;//不会导致类的加载
//		System.out.println(K.NUM);//常量NUM的值是一个字面常量则访问这个常量NUM时不会导致类的加载
//		System.out.println(K.D);//常量D的值是一个非字面常量，则在访问常量D时会导致类的加载
//		System.out.println("所以，不能简单地认为第一次访问某类的静态常量不会导致该类的加载，要看常量值是不是字面量");
//		Class c2 = Class.forName("com.asiainfo.chapter14.Test6");//为什么执行这一行的时候没有导致类K的加载？是因为上面的代码已经加载过了，类只加载一次
		System.out.println(K.l);
	}
}
 class K {
	 public static final int NUM = 1;
	 public static final double D = Math.random();
	 public static long l = 12L;
	 static {
		 System.out.println("Initializing K");
	 }
 }
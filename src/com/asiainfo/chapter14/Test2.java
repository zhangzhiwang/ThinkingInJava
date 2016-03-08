package com.asiainfo.chapter14;

/**
 * 获得Class对象
 * 
 * @author zhangzw8
 * @date 2016年3月8日 上午9:09:39
 */
public class Test2 {
	public static void main(String[] args) throws ClassNotFoundException {
		// 要想在运行时获得类型信息，必须首先获得Class对象。获取Class对象有两个途径：
		//途径一：Class.forName()方法
		Class c1 = Class.forName("com.asiainfo.chapter14.Test1");//此方法的优点是：在获取Class对象之前无需持有具体类型的实例（比如Test1的实例）

		//途径二：Object的getClass()方法
		Test1 t = new Test1();
		Class c2 = t.getClass();//如果已持有一个具体类型的引用（比如t），那么可用该引用调用基类Object的getClass()方法
		
		//要区分Class对象和具体某一个类的对象
	}
}

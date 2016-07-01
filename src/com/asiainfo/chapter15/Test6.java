package com.asiainfo.chapter15;

/**
 * 类的所有构造方法被定义为私有的，则该类不能被继承
 * 
 * @author zhangzw8
 * @date 2016年7月1日 上午9:55:12
 */
public class Test6 {
	private Test6() {}
	
	private Test6(int i) {}
}

//class Test6_1 extends Test6 {}//Implicit super constructor Test6() is not visible for default constructor. Must define an explicit constructor

//class Test6_2 extends Test6 {//类的所有构造方法被定义为私有的，则该类不能被继承
////	public Test6_2(int i) {
////		super(i);//The constructor Test6(int) is not visible
////	}
//	
////	public Test6_2() {}//Implicit super constructor Test6() is not visible. Must explicitly invoke another constructor
//}
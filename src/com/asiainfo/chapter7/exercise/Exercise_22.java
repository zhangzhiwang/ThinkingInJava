package com.asiainfo.chapter7.exercise;

/**
 * p145练习22
 * @author zhangzhiwang
 * 2015年8月9日
 */
public class Exercise_22 {

}

final class Car7 {
	public final int i1 = 1;// final class的成员变量并非默认是final的，如果想将某成员变量定义为常量需显示地声明
	public int i2;
	
	public void func1() {}
	
	public final void func2() {}// final class的方法默认是final的，显示地添加final关键字并无实际意义
}

//class Car8 extends Car7{}// The type Car8 cannot subclass the final class Car7

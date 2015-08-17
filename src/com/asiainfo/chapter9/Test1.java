package com.asiainfo.chapter9;

/**
 * 抽象类
 * 
 * @author zhangzhiwang
 * @date 2015年8月15日 下午9:09:36
 */
public abstract class Test1 {
	public void func1() {}
	
	public abstract void func2();// 只要类中有一个抽象方法该类就必须声明为abstract
	
	public abstract void func3();
	
	public static void main(String[] args) {
//		Test1 t = new Test1();// Cannot instantiate the type Test1 抽象类不能创建对象
	}
}

abstract class A extends Test1 {// 如果一个类继承了抽象类，那么该子类必须实现父类的所有抽象方法，否则子类要声明为abstract
	@Override
	public void func2() {}
}

class B extends Test1 {
	@Override
	public void func2() {}
	
	@Override
	public void func3() {}
}
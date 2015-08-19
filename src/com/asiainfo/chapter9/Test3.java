package com.asiainfo.chapter9;

/**
 * 方法重载和重写——方法重载之和方法签名有关，与访问控制权限和返回值类型无关；而方法的重写与访问控制权限、返回值类型、方法签名都有关系
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月18日 上午11:16:27
 */
public class Test3 {
	public void func1() {}
	
//	public int func1() {}// Duplicate method func1() in type Test3
	
//	private void func1() {}// Duplicate method func1() in type Test3
	
	public void func1(int i) {}
	
	public void func1(int i, String s) {}
	
	public void func1(String s, int i) {}
	
	public void func2() {}
	
	public F func3() {
		return new F();
	}
	
}

class E extends Test3 {
	@Override
	public void func2() {}
	
//	@Override
//	public void func2(int i) {}// The method func2(int) of type E must override or implement a supertype method
	
//	@Override
//	public int func2() {// The return type is incompatible with Test3.func2()
//		return 1;
//	}
	
//	@Override
//	private void func2() {}// Cannot reduce the visibility of the inherited method from Test3
	
	@Override
	public F1 func3() {
		return new F1();
	}
}

class F {}

class F1 extends F {}
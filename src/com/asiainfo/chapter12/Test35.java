package com.asiainfo.chapter12;

/**
 * 子类覆盖两个父类（一个普通类一个接口）的同名方法所抛异常的情况
 * 
 * @author zhangzw8
 * @date 2016年1月30日 下午7:58:23
 */
public class Test35 extends Test35F1 implements Test35F2 {
	@Override
	public void func1() throws H11 {}//H11是H和H1的子集
	
//	public void func1() throws H1 {}//H1是H和H1的子集
	
//	public void func1() throws H {}//H不是H和H1的子集
	
	@Override
	public void func2() {}//H和I的子集是空集，所以子类在复写func2的时候不能抛出任何受检异常
	
//	public void func2() throws H{}//Exception H is not compatible with throws clause in Test35F2.func2()
	
//	public void func2() throws I{}//Exception I is not compatible with throws clause in Test35F1.func2()
	
//	public void func2() throws H, I{}//Exception I is not compatible with throws clause in Test35F1.func2()
	//结论：当一个子类继承一个父类同时又实现一个接口的情况下，而父类和接口有同名的方法，当子类去覆盖这个方法时所抛的异常应为两个基类所抛异常的子集
}

class Test35F1 {
	public void func1() throws H {}
	
	public void func2() throws H {}
}

interface Test35F2 {
	void func1() throws H1;
	
	void func2() throws I;
}

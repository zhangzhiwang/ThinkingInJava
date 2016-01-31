package com.asiainfo.chapter12;

/**
 * 当方法覆盖时，子类不能抛出比父类范围更大的异常
 * 
 * @author zhangzw8
 * @date 2016年1月30日 上午8:11:03
 */
public class Test34 extends Test34F{
	@Override
//	public void func1() throws H1 {}//范围一样
	
//	public void func1() throws H11 {}//范围更小
	
//	public void func1() throws H {}//范围更大
	
//	public void func1() {}
	
//	public void func1() throws H1 {
//		try {
//			throw new I();//在方法覆盖中，如果子类抛出了一个新的（父类没有的）异常，那么编译器会强制你捕获它。这里所谓新的异常指的是受检异常
//		} catch (I i) {
//			i.printStackTrace();
//		}
//	}
	
//	public void func1() throws H1 {
//		try {
//			func2();
//		} catch (I i) {
//			i.printStackTrace();
//		}
//	}
	
	public void func1() throws H1 {
		throw new RuntimeException();//抛出运行时异常时可以的，因为运行时异常不需要被强制被捕获或抛出
	}
	
	public void func2() throws I {}
	//对于构造方法，子类不能抛出比父类范围更小的异常；对与方法覆盖，子类不能抛出比父类范围更大的异常
}

class Test34F {
	public void func1() throws H1 {}
}

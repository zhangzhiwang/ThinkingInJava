package com.asiainfo.chapter12;

/**
 * 子类构造方法所抛出的异常必须比所调用的父类构造方法所抛出的异常范围更大或一样
 * 
 * @author zhangzw8
 * @date 2016年1月30日 上午7:37:56
 */
public class Test33 extends Test33Father {
	public Test33() throws H1{}//一样（默认调s用的是父类无餐构造方法）
	
//	public Test33() throws H {}//范围更大
	
//	public Test33() throws H1, I{}//范围更大
	
//	public Test33() throws Exception {
//		super("a");//要比所调用的那个父类构造方法抛出的异常更多或一样
//	}
	
//	public Test33() throws H11 {}//不能抛出比父类范围更小的异常
}

class H extends Exception {}

class H1 extends H {}

class H11 extends H1 {}

class I extends Exception {}

class Test33Father {
	public Test33Father() throws H1 {}
	
	public Test33Father(String s) throws I {}
}
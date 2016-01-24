package com.asiainfo.chapter12;

/**
 * 子类的构造方法所抛出的异常必须比所调用（包括默认调用）的父类构造方法所抛出的异常范围更大或一样
 * 
 * @author zhangzw8
 * @date 2016年1月24日 下午5:17:23
 */
public class Test32 extends Father {
//	public Test32() {}  //不可以
	
//	public Test32() throws G11{}  //不可以
	
//	public Test32 () throws G1{}  //可以
	
//	public Test32() throws Exception {} //可以
	
//	public Test32() throws G1, G2{}  //可以
	
//	public Test32() throws G2 {//可以
//		super("a", 1);
//	}
	
//	public Test32() throws Exception {//可以
//		super("a", 1);
//	}
	
//	public Test32() throws G21 {//不可以
//		super("a", 1);
//	}
	
//	public Test32() throws G1 {// 不可以
//		super("a", 1);
//	}
	
	public Test32() throws G1, G2 {// 可以
		super("a", 1);
	}
	
//	public Test32(String s) {  //可以
//		super(s);
//	}
	
	public Test32(String s) throws Exception {  //可以
		super(s);
	}
	
	
}

class G extends Exception {
	
}

class G1 extends G {}

class G2 extends G {}

class G11 extends G1 {}

class G21 extends G2 {}

class Father {
	public Father() throws G1 {}
	
	public Father(String s) {}
	
	public Father(String s, int i) throws G2{}
}
package com.asiainfo.chapter12;

/**
 * 子类构造器不能捕获所调用的父类构造器抛出的异常，即必须把父类构造器的异常抛出来（或抛出范围更大的异常）
 * 
 * @author zhangzw8
 * @date 2016年1月30日 下午8:24:43
 */
public class Test36 extends Test36F {
	 public Test36() throws H {//正确
		 super();
	 }

//	public Test36() {
//		try {super();} catch (H h) {//Constructor call must be the first statement in a constructor
//			h.printStackTrace();
//		}
//	}
}

class Test36F {
	public Test36F() throws H {
	}
}
package com.asiainfo.chapter12;

/**
 * 有关构造器的一些问题
 * 
 * @author zhangzw8
 * @date 2016年1月30日 下午8:37:32
 */
public class Test37 {
	public Test37() {
		try {
			throw new RuntimeException();//构造方法里面可以有try/catch块
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	public Test37(String s) {
//		System.out.println("hello");
//		super();//Constructor call must be the first statement in a constructor.
//	}
	
	public Test37(String s) {
		new Test37S();//父类构造器可以调用子类构造器
	}
}

class Test37S extends Test37{
	public Test37S () {
		super("1");
//		super();//Constructor call must be the first statement in a constructor
	}
}
package com.asiainfo.chapter21;

/**
 * 内部类
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月19日 下午7:10:43
 */
public class Test22 {
	public static void main(String[] args) {
	}
	
	public class Inner {}
	
	public void met1() {
		new Inner();//默认this.new Inner();  this被省略掉了
		this.new Inner();
	}
	
	public static void met2() {
//		new Inner();//No enclosing instance of type Test22 is accessible. Must qualify the allocation with an enclosing instance of type Test22 (e.g. x.new A() where x is an instance of Test22).
		new Test22().new Inner();
	}
}

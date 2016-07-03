package com.asiainfo.chapter15;

/**
 * 显式的类型说明（在调用泛型方法时）
 *
 * @author zhiwangzhang
 * @date 2016年7月3日 下午12:44:25
 */
public class Test28 {
	public <T> T m1() {
		return null;
	}
	
	public void m2(Integer i) {}
	
	public void m3() {
		m2(1);
//		m2(this.m1());//The method m2(Integer) in the type Test28 is not applicable for the arguments (Object)
		m2(this.<Integer>m1());
//		m2(Test28.m4());//The method m2(Integer) in the type Test28 is not applicable for the arguments (Object)
		m2(Test28.<Integer>m4());
	}
	
	public static <T> T m4() {
		return null;
	}

}

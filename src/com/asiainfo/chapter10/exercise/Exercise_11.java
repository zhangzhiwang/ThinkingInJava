package com.asiainfo.chapter10.exercise;

/**
 * p196练习11
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月20日 上午10:51:05
 */
public interface Exercise_11 {

}

class F {

	public A getA() {
		return new A();
	}
	
	public Exercise_11 getA2() {
		return new A();
	}

	private class A implements Exercise_11 {
		public void func1() {}
	}

}

class G {
	public static void main(String[] args) {
		F f = new F();
//		A a1 = f.getA();
		Exercise_11 e = f.getA2();
		A a2 = (A)e;
		a2.func1();
	}
}
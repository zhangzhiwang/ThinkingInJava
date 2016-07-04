package com.asiainfo.chapter15;

/**
 * p354练习2
 * 
 * @author zhangzw8
 * @date 2016年7月1日 下午4:10:27
 */
public class Test8<B> {
	private B b1;
	private B b2;
	private B b3;
	
	public Test8() {}
	
	public Test8(B b1, B b2, B b3) {
		this.b1 = b1;
		this.b2 = b2;
		this.b3 = b3;
	}

	public B getB1() {
		return b1;
	}

	public void setB1(B b1) {
		this.b1 = b1;
	}

	public B getB2() {
		return b2;
	}

	public void setB2(B b2) {
		this.b2 = b2;
	}

	public B getB3() {
		return b3;
	}

	public void setB3(B b3) {
		this.b3 = b3;
	}
	
	public static void main(String[] args) {
		Test8<String> t = new Test8<String>("a", "b", "c");
		String s1 = t.getB1();
		String s2 = t.getB2();
		String s3 = t.getB3();
		System.out.println(s1 + "," + s2 + "," + s3);
	}
}

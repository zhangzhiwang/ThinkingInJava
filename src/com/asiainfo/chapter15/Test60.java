package com.asiainfo.chapter15;

/**
 * 泛型会擦除到边界
 *
 * @author zhiwangzhang
 * @date 2016年7月13日 下午9:08:37
 */
public class Test60<T extends Test60_1> {
	private T[] ts ;
	
	public Test60() {}
	
	public Test60(int length) {
		ts = (T[]) new Test60_1[length];
	}
	
	public T[] getTs() {
		return ts;
	}
	
	public static void main(String[] args) {
		Test60<Test60_1> t = new Test60<Test60_1>(1);
		System.out.println(t.ts);
		Test60<Test60_1_1> t2 = new Test60<Test60_1_1>(1);
		System.out.println(t2.ts);
		
		Test60_1[] tests = t.ts;
//		Test60_1_1[] tests2 = t2.ts;//java.lang.ClassCastException: [Lcom.asiainfo.chapter15.Test60_1; cannot be cast to [Lcom.asiainfo.chapter15.Test60_1_1;
		Test60_1[] tests3 = t2.ts;
	}
}

class Test60_1 {}

class Test60_1_1 extends Test60_1 {}
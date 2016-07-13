package com.asiainfo.chapter15;

/**
 * 无法创建泛型数组
 *
 * @author zhiwangzhang
 * @date 2016年7月13日 下午12:59:19
 */
public class Test57 {
	private Test57_1<Integer> t = new Test57_1<Integer>();
//	private Test57_1<Integer>[] ts = new Test57_1<Integer>[1];//Cannot create a generic array of Test57_1<Integer>
	private Test57_1<Integer>[] ts2 = new Test57_1[1];
	private Test57_1[] ts3 = new Test57_1[1];//ts、ts2、ts3  why?
	
	public static void main(String[] args) {
//		Test57_1<Integer>[] t4 = (Test57_1<Integer>[]) new Object[1];//编译可以通过，但运行时会抛异常：java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Lcom.asiainfo.chapter15.Test57_1;
		Test57_1<Integer>[] ts5 = new Test57_1[1];//运行也不会抛异常
		Test57_1[] ts6 = new Test57_1[1];
		
		ts5[0] = new Test57_1<Integer>();
		ts5[1] = (Test57_1<Integer>) new Object();
//		ts5[2] = new Test57_1<Boolean>();//Type mismatch: cannot convert from Test57_1<Boolean> to Test57_1<Integer>
		ts5[3] = new Test57_1();
		
		ts6[0] = new Test57_1<Integer>();
		ts6[1] = (Test57_1) new Object();
		ts6[2] = new Test57_1<Boolean>();
		ts6[3] = new Test57_1<String>();
		ts6[3] = new Test57_1();
	}
}

class Test57_1<T> {}
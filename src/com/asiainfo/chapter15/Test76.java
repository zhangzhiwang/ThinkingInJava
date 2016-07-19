package com.asiainfo.chapter15;

/**
 * 通配符
 * 
 * @author zhangzw8
 * @date 2016年7月19日 下午1:10:35
 */
public class Test76<T> {
	private T t;
	
	public Test76() {}
	
	public Test76(T t) {
		this.t = t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
	
	public void m1(Object o) {}
	
	public static void main(String[] args) {
		Test76<K> t1 = new Test76<K>(new K());
//		Test76<J> t2 = t1;//Type mismatch: cannot convert from Test76<K> to Test76<J>
//		Test76<J> t3 = new Test76<K>();//Type mismatch: cannot convert from Test76<K> to Test76<J>  泛型前后要一致，若想不一致，需要向上转型为带通配符的泛型边界
		Test76<? extends J> t4 = new Test76<K>(new K());
//		t4.setT(null);
//		t4.setT(new J());//The method setT(capture#2-of ? extends J) in the type Test76<capture#2-of ? extends J> is not applicable for the arguments (J)
		J j1 = t4.getT();
		K k1 = (K) t4.getT();
		L l1 = (L) t4.getT();//编译通过，运行时报异常：java.lang.ClassCastException: com.asiainfo.chapter15.K cannot be cast to com.asiainfo.chapter15.L
	}
}

class J extends Test76 {}

class K extends J {}

class L extends J {}
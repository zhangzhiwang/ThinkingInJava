package com.asiainfo.chapter15;

/**
 * 创建泛型数组的唯一方式——创建一个Object数组，并将其转型
 *
 * @author zhiwangzhang
 * @date 2016年7月13日 下午8:47:35
 */
public class Test59<T> {
	private T[] ts;
	
	public Test59() {}
	
//	@SuppressWarnings("unchecked")
	public Test59(int length) {
		ts = (T[])new Object[length];//Type safety: Unchecked cast from Object[] to T[]
	}
	
	public void put(int index, T t) {
		ts[index] = t;
	}
	
	public T get(int index) {
		return ts[index];
	}
	
	public T[] getTs() {
		return ts;
	}
	
	public static void main(String[] args) {
		Test59<Integer> t = new Test59<Integer>(3);
		System.out.println(t.ts);
//		Integer[] is = t.ts;//java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.Integer;
		Object[] os = t.ts;
	}
}

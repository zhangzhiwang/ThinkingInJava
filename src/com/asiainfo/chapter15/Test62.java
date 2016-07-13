package com.asiainfo.chapter15;

import java.lang.reflect.Array;

/**
 * 实例化泛型数组的推荐方式——Array.newInstance()
 *
 * @author zhiwangzhang
 * @date 2016年7月13日 下午9:43:59
 */
public class Test62<T> {
	private T[] ts;
	public Test62() {}
	
	public Test62(Class<T> cla, int length) {
		ts = (T[]) Array.newInstance(cla, length);//Type safety: Unchecked cast from Object to T[]
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
		Test62<String> t = new Test62<String>(String.class, 1);
		t.put(0, "hello");
		System.out.println(t.get(0));
		String[] ss = t.ts;//why?
		Object[] ss2 = t.ts;
	}
}

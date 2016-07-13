package com.asiainfo.chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建泛型数组方式一——使用List<T>代替T[]
 *
 * @author zhiwangzhang
 * @date 2016年7月13日 下午12:50:48
 */
public class Test56<T> {
//	private T[] ts = new T[1];//Cannot create a generic array of T
	private List<T> array = new ArrayList<T>();
	
	public void set(T t) {
		array.add(t);
	}
	
	public T get(int index) {
		return array.get(index);
	}
	
	public static void main(String[] args) {
		Test56<String> t = new Test56<String>();
		t.set("hello");
		System.out.println(t.get(0));
	}
}

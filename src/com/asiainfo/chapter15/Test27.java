package com.asiainfo.chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * 什么时候会进行参数推断
 *
 * @author zhiwangzhang
 * @date 2016年7月3日 上午11:26:01
 */
public class Test27 {
	public static <T> List<T> getList() {
		return new ArrayList<T>();
	}
	
	public static void m(List<Integer> list) {}
	
	public static <T> int getInt(T t) {
		return 1;
	}
	
	public static void m2(Integer i) {}
	
	public static void m3(List<Object> list) {}
	
	public static void main(String[] args) {
		List<Integer> list = Test27.getList();//在赋值操作时，编译器会进行参数推断，可以理解为在getList()方法的内部，将Object向下转型为Integer之后再返回并赋值给list变量
//		Test27.m(getList());//The method m(List<Integer>) in the type Test27 is not applicable for the arguments (List<Object>)  如果将泛型方法的调用结果（该方法的返回值里面具有泛型参数）作为另一的方法的入參，则编译器不会进行参数推断
		m2(getInt(""));
		m3(getList());
	}
}

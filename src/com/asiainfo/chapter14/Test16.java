package com.asiainfo.chapter14;

import java.util.ArrayList;
import java.util.List;

/**
 * 带泛型的Class
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月11日 下午9:42:31
 */
public class Test16 {
	static List<Class<? extends L>> list = new ArrayList<Class<? extends L>>();
	public static void main(String[] args) {
		list.add(L1.class);
		list.add(Test12.class);
		list.add(L.class);
//		list.add(Test16.class);//The method add(Class<? extends L>) in the type List<Class<? extends L>> is not applicable for the arguments (Class<Test16>)

		
	}
	
	public static void met1(String s) throws ClassNotFoundException {
//		list.add(Class.forName(s));//The method add(Class<? extends L>) in the type List<Class<? extends L>> is not applicable for the arguments (Class<capture#1-of ?>)
	}
	
	public static void met2(Class c) {
		list.add(c);
	}
	
	public static void met3(Class<?> c) {
//		list.add(c);//The method add(Class<? extends L>) in the type List<Class<? extends L>> is not applicable for the arguments (Class<capture#1-of ?>)
	}
}

package com.asiainfo.chapter11;

import java.util.ArrayList;

/**
 * ArrayList使用泛型
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年9月1日 上午9:36:12
 */
public class Test2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Test2());
		list.add(new Test1());

		for (int i = 0; i < list.size(); i++) {
//			System.out.println((Test2) list.get(i));// 如果不使用泛型会在运行时发现错误
		}
		
		ArrayList<Test1> list2 = new ArrayList<Test1>();
		list2.add(new Test1());
//		list2.add(new Test2());// The method add(Test1) in the type ArrayList<Test1> is not applicable for the arguments (Test2)，使用泛型会在编译期发现错误。越早发现错误对解决问题越有利。
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));// 不需要向下转型
		}
		
		ArrayList<Test1> list3 = new ArrayList<Test1>();
		list3.add(new Test1());
		list3.add(new B());
		
		for (Test1 t : list3) {
			System.out.println(t);
		}
	}
}

class B extends Test1 {}
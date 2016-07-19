package com.asiainfo.chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 通配符
 * 
 * @author zhangzw8
 * @date 2016年7月19日 上午8:11:16
 */
public class Test75 {
	public static void main(String[] args) {
//		List<? extends Test75> list = new ArrayList<Test75_1>();
//		Test75 t1 = list.get(0);
//		Test75_1 t2 = (Test75_1) list.get(1);
//		Test75_2 t3 = (Test75_2) list.get(2);//编译不报错
		
//		List<? extends Test75> list2 = Arrays.<Test75>asList(new Test75(), new Test75_1(), new Test75_2());
//		Test75 t1 = list2.get(0);
//		Test75_1 t2 = (Test75_1) list2.get(1);
//		Test75_2 t3 = (Test75_2) list2.get(2);
		
		List<? extends Test75> list3 = new ArrayList<Test75_1>();
//		list3.add(new Test75_1());
		
		Test75 t = new Test75();
		Test75_1 t2 = (Test75_1) t;
		Test75_2 t3 = (Test75_2) t;//向下转型编译能通过（如果具有继承关系的话），但运行时可能会抛异常：java.lang.ClassCastException
	}
}

class Test75_1 extends Test75 {}

class Test75_2 extends Test75 {}
package com.asiainfo.chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * 通配符
 *
 * @author zhiwangzhang
 * @date 2016年7月16日 下午12:15:01
 */
public class Test75 {
	public static void main(String[] args) {
		List<Test75> l1 = new ArrayList<Test75>();
//		List<Test75> l2 = new ArrayList<Test75_1>();//Type mismatch: cannot convert from ArrayList<Test75_1> to List<Test75> 这不是多态
		List<? extends Test75> l3 = new ArrayList<Test75>();
		List<? extends Test75> l4 = new ArrayList<Test75_1>();
		List<? extends Test75> l5 = new ArrayList<Test75_1_1>();
		
//		l4.add(new Test75_1());
//		l4.add(new Test75_1_1());
//		l4.add(new Test75());
		Test75 t1 = l3.get(0);
//		Test75_1 t2 = l4.get(0);//Type mismatch: cannot convert from capture#2-of ? extends Test75 to Test75_1
		Test75 t3 = l4.get(0);
		Test75_1 t4 = (Test75_1) l4.get(0);
		
//		l1.add(new Test75());
//		l1.add((Test75) new Object());
	}
}

class Test75_1 extends Test75 {}

class Test75_1_1 extends Test75_1 {}

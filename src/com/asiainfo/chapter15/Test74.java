package com.asiainfo.chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * 向上／向下转型的混淆
 *
 * @author zhiwangzhang
 * @date 2016年7月16日 下午12:00:47
 */
public class Test74 {
	public static void main(String[] args) {
		ArrayList<Test74> l1 = new ArrayList<Test74>();
		ArrayList<Test74_1> l2 = new ArrayList<Test74_1>();
//		l1 = l2;//Type mismatch: cannot convert from ArrayList<Test74_1> to ArrayList<Test74>    Test74_1是Test74的子类，但盛放Test74_1的容器（ArrayList<Test74_1>）可不是盛放Test74的容器（ArrayList<Test74>）的子类，这不同于数组。
//		ArrayList<Test74> l3 = new ArrayList<Test74_1>();//这不是多态
//		List<Test74> l3 = new ArrayList<Test74_1>();//这也不是多态
	}
}

class Test74_1 extends Test74 {}
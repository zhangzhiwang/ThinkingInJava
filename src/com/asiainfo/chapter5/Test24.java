package com.asiainfo.chapter5;

/**
 * 可变参数列表
 * 
 * @author zhangzhiwang 2015年8月5日
 */
public class Test24 {
	public static void main(String[] args) {
		func(1, 2, 3);
		func(new Object[] { 1, 2, 3 }, new Object[] { new Test24(), "asd", 1, new Integer(1) });
		func('b');
		func();// 不会导致第17行空指针
	}

	public static void func(Object... args) {
		System.out.println("args.length = " + args.length);
		for (Object o : args) {
			System.out.print(o + "\t");
		}
		System.out.println();
	}
}

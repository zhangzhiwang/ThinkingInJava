package com.asiainfo.chapter12;

/**
 * 异常抛出地点之后的代码不会被执行，如果有try块，指的是在try块内部异常抛出地点之后的代码不会被执行
 * 
 * @author zhangzw8
 */
public class Test8 {
	public static void main(String[] args) {
		// System.out.println(1);
		// System.out.println(2);
		// String str = null;
		// str.length();
		// System.out.println(3);
		// System.out.println(4);
		// System.out.println(5);

		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
			String str = null;
			str.length();
			System.out.println(4);
			System.out.println(5);
			System.out.println(6);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);

	}
}

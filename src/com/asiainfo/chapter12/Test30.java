package com.asiainfo.chapter12;

/**
 * 当try块内部抛出异常时，try/catch外部的代码到底会不会执行
 * 
 * @author zhangzw8
 * @date 2016年1月23日 下午3:55:14
 */
public class Test30 {
	public static void main(String[] args) {
		// try {
		// System.out.println(1);
		// String s = null;
		// s.length();
		// System.out.println(2);
		// } catch (ClassCastException e) {
		// e.printStackTrace();
		// }
		// System.out.println(3);

		try {
			System.out.println(1);
			String s = null;
			s.length();
			System.out.println(2);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println(3);
		System.out.println("结论：当try块内部抛出异常后，如果catch块捕获住了该异常，则try/catch语句块后面的代码仍会被执行；如果没有捕获到，则不会执行");
	}
}

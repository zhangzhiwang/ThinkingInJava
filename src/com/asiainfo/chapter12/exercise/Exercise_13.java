package com.asiainfo.chapter12.exercise;

/**
 * p267练习13
 * 
 * @author zhangzw8
 * @date 2016年1月23日 下午3:38:49
 */
public class Exercise_13 {
	public static void func1() throws C, D, E {
		System.out.println("func1");
	}

	public static void main(String[] args) {
		try {
			func1();
			String s = null;
			s.length();
		} catch (C c) {
			System.out.println("Caught c");
			c.printStackTrace();
		} catch (D d) {
			System.out.println("Caught d");
			d.printStackTrace();
		} catch (E e) {
			System.out.println("Caught e");
			e.printStackTrace();
		} finally {
			System.out.println("hello");
		}
	}
}
package com.asiainfo.chapter12;

/**
 * 当一场没有被catch住的时候，在将异常抛给更高的层次之前先执行finally
 * 
 * @author zhangzw8
 * @date 2016年1月23日 下午3:17:40
 */
public class Test28 {
	public static void func1() {
		try {
			String s = null;
			s.length();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Caught IndexOutOfBoundsException.");
		} finally {
			System.out.println("hello");
		}
	}

	public static void func2() {
		try {
			func1();
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException.");
		}
	}

	public static void main(String[] args) {
		func2();
	}
}

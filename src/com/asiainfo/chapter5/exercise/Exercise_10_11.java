package com.asiainfo.chapter5.exercise;

/**
 * p89��ϰ10
 *
 * @author zhangzw8@asiainfo.com\n
 *         2015��8��4��
 */
public class Exercise_10_11 {
	private boolean flag;
	
	public static void main(String[] args) throws Throwable {
		Exercise_10_11 e = new Exercise_10_11();
		e.flag = true;
		System.gc();
		e.finalize();
	}
	
//	public void finalize() {
////		if (flag) {
//			System.out.println("finalize");
////		}
//	}
}

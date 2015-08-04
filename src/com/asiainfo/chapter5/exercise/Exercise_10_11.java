package com.asiainfo.chapter5.exercise;

/**
 * p89Á·Ï°10
 *
 * @author zhangzw8@asiainfo.com\n
 *         2015Äê8ÔÂ4ÈÕ
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

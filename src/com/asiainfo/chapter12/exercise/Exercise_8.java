package com.asiainfo.chapter12.exercise;

/**
 * p256练习8
 * 
 * @author zhangzw8
 * @date 2016年1月21日 上午9:45:51
 */
public class Exercise_8 {

	public static void func1() throws Exception {
		String str = null;
		str.length();
	}

	public static void main(String[] args) {
		try {
			func1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

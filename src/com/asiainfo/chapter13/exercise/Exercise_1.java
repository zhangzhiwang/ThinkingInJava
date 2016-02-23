package com.asiainfo.chapter13.exercise;

/**
 * p287练习1
 * 
 * @author zhangzw8
 * @date 2016年2月2日 下午1:29:48
 */
public class Exercise_1 {
	// 比较String的拼接与StringBuilder的append()方法的效率，用javap -c 类名称 查看
	public static String met1() {
		String s = "";
		for (int i = 1; i <= 3; i++) {
			s += i;
		}
		return s;
	}

	public static String met2() {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 3; i++) {
			sb.append(i);
		}
		return sb.toString();
	}
}

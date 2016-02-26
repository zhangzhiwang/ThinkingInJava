package com.asiainfo.chapter13;

import java.util.Arrays;

/**
 * split()
 * 
 * @author zhangzw8
 * @date 2016年2月26日 上午9:09:11
 */
public class Test13 {
	public static void main(String[] args) {
		String s = "Our, name was inspired by. a poem written more than 800 years "
				+ "confronted by life's many obstacles... hundreds and thousands of times, for "
				+ "waning, and there she stood... Baidu, whose literal meanin is +hundreds of times";
		System.out.println(Arrays.asList(s.split(" ")));
		System.out.println(Arrays.asList(s.split("\\W")));
		System.out.println(Arrays.asList(s.split("n\\W+")));
	}
}

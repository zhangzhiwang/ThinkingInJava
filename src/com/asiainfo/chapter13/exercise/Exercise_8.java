package com.asiainfo.chapter13.exercise;

import java.util.Arrays;

/**
 * p297练习8
 * 
 * @author zhangzw8
 * @date 2016年2月26日 下午1:11:58
 */
public class Exercise_8 {
	public static void main(String[] args) {
		String s = "Our, name was inspired by. a poem written more the 800 years "
				+ "confronted by life's and obstacles... hundreds and thousands of times, for "
				+ "wanding, and there she stood... Baidu, the literal meanin is +hundreds of times";
		System.out.println(Arrays.asList(s.split("and|the")));
	}
}

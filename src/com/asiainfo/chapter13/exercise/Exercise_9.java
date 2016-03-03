package com.asiainfo.chapter13.exercise;

/**
 * p297练习9
 * 
 * @author zhangzw8
 * @date 2016年2月26日 下午1:21:52
 */
public class Exercise_9 {
	public static void main(String[] args) {
		String s = "Our, name was inspired by. a poem written more than 800 years "
				+ "confronted by life's many obstacles... hundreds and thousands of times, for "
				+ "waning, and there she stood... Baidu, whose literal meanin is +hundreds of times";
		System.out.println(s.replaceAll("(?i)[aeiou]", "_"));
	}
}

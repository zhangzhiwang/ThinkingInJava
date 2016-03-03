package com.asiainfo.chapter13;

import java.util.Arrays;

/**
 * split()
 * 
 * @author zhangzw8
 * @date 2016年2月26日 下午12:24:23
 */
public class Test15 {
	public static void main(String[] args) {
		String s = "Our, name was inspired by. a poem written more than 800 years "
				+ "confronted by life's many obstacles... hundreds and thousands of times, for "
				+ "waning, and there she stood... Baidu, whose literal meanin is +hundreds of times";
		System.out.println(Arrays.asList(s.split("\\w+")));
		System.out.println(Arrays.asList(s.split("\\w")));
		
		String s1 = "1+2-3(";
		System.out.println(Arrays.asList(s1.split("\\w")));
	}
}

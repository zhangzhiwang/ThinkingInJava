package com.asiainfo.chapter13;

/**
 * replace()
 * 
 * @author zhangzw8
 * @date 2016年2月26日 下午12:48:01
 */
public class Test16 {
	public static void main(String[] args) {
		String s = "Our, 123 was inspir12 by. a poem named more than 800 years "
				+ "confronted by life's many obstacles... namespace and thousands of times, for "
				+ "waning, and there she stood... Baidu, whose literal meanin is +hundreds of times";
		System.out.println(s.replaceFirst("n\\w+", "AAA"));
		System.out.println(s.replaceFirst("n\\w", "AAA"));
		System.out.println(s.replaceAll("n\\w+","AAA"));
	}
}

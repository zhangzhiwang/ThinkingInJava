package com.asiainfo.chapter13;

/**
 * 字符型正则表达式
 * 
 * @author zhangzw8
 * @date 2016年2月26日 下午1:39:07
 */
public class Test17 {
	public static void main(String[] args) {
		for (String regex : new String[]{"Zhangzhiwang123", "[A-Z].[aeiou][a-z]*\\d+", "\\D\\w+\\d+"}) {
			System.out.println("Zhangzhiwang123".matches(regex));
		}
	}
}

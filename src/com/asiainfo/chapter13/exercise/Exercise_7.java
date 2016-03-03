package com.asiainfo.chapter13.exercise;

/**
 * p297练习7
 * 
 * @author zhangzw8
 * @date 2016年2月26日 下午12:59:09
 */
public class Exercise_7 {
	public static void main(String[] args) {
		String s= "Hello, world...";
		System.out.println(s.matches("\\p{javaUpperCase}.*\\."));
	}
}

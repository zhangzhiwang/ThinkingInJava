package com.asiainfo.chapter13;

import java.util.Arrays;

/**
 * split()的重载版本
 * 
 * @author zhangzw8
 * @date 2016年2月26日 上午9:35:03
 */
public class Test14 {
	public static void main(String[] args) {
		String s = "1|2|3||";
		System.out.println(Arrays.asList(s.split("\\|")));
		System.out.println(Arrays.asList(s.split("\\|", 2)));//详细解释见jdk api
		System.out.println(Arrays.asList(s.split("\\|", 4)));
		System.out.println(Arrays.asList(s.split("\\|", 5)));
		System.out.println(Arrays.asList(s.split("\\|", -1)));
		System.out.println(Arrays.asList(s.split("\\|", 0)));
	}
}

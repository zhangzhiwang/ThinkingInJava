package com.asiainfo.chapter13;

import java.util.regex.Pattern;

/**
 * Pattern的常用方法
 * 
 * @author zhangzw8
 * @date 2016年3月4日 下午12:41:08
 */
public class Test21 {
	public static void main(String[] args) {
		System.out.println(Pattern.matches("abc+", "abccd"));//完全匹配
		Pattern pattern = Pattern.compile("abc");
		String[] ss = pattern.split("dabcfabcg");
		for (String s : ss) {
			System.out.print(s + "\t");
		}
	}
}

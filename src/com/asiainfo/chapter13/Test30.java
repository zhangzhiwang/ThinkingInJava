package com.asiainfo.chapter13;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Pattern的split()方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 下午3:35:59
 */
public class Test30 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\|");
		String[] ss = pattern.split("a|b|c");
		System.out.println(Arrays.toString(ss));
		String[] ss2 = pattern.split("a|b|c", 2);//模式被应用limit-1次
		System.out.println(Arrays.toString(ss2));
	}
}

package com.asiainfo.chapter13.exercise;

import java.util.Arrays;

/**
 * p306练习14
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 下午3:42:02
 */
public class Exercise_14 {
	public static void main(String[] args) {
		String s = "a|b|c";
		String[] ss = s.split("\\|");
		System.out.println(Arrays.toString(ss));
		String[] ss2 = s.split("\\|", 2);
		System.out.println(Arrays.toString(ss2));
	}
}

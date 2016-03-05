package com.asiainfo.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * \\w+可用来划分单词
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月5日 下午7:27:59
 */
public class Test23 {
	public static void main(String[] args) {
		String s = "My name is zzw.";
		Pattern pattern = Pattern.compile("\\w+");//一个或连续多个字符
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			System.out.print(matcher.group() + "\t");
		}
	}
}

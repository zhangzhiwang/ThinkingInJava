package com.asiainfo.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern和Matcher
 * 
 * @author zhangzw8
 * @date 2016年3月4日 上午8:55:14
 */
public class Test18 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("a");//pattern为编译后的正则表达式
		Matcher matcher = pattern.matcher("a");//matcher为匹配器
		System.out.println(matcher.find());//判断输入字符序列是否匹配正则表达式，并将匹配成功的子序列"截取"掉，详见jdk，无参find()方法不会重置匹配器，所以该方法的后续调用将从此匹配操作未匹配的第一个字符开始。

		System.out.println(matcher.group());//返回由以前匹配操作所匹配的输入子序列，即把匹配的部分输出出来
		System.out.println(matcher.start());//返回以前匹配的初始索引
		System.out.println(matcher.end());//返回最后匹配字符之后的偏移量，是能匹配上正则表达式的输入子序列最后一个字符的index+1
	}
}

package com.asiainfo.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Matcher的常用方法
 * 
 * @author zhangzw8
 * @date 2016年3月4日 下午12:49:03
 */
public class Test22 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("abc");
		Matcher matcher = pattern.matcher("abcabcabcdefabc");
		System.out.println(matcher.matches());//完全匹配，相当于Pattern.matches(String regex, CharSequence input);
		System.out.println(matcher.lookingAt());//判断参数字符序列是不是以正则表达式开头
		while(matcher.find(1)) {//带参数的find()方法会重置匹配器，所以该方法的后续调用将不会从此匹配操作未匹配的第一个字符开始而是重新开始，所以 这里是个死循环
			System.out.println(matcher.group() + "(" + matcher.start() + "," + (matcher.end() - 1) + ")");
		}
	}
}

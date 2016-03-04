package com.asiainfo.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Matcher的find()方法
 * 
 * @author zhangzw8
 * @date 2016年3月4日 上午9:52:59
 */
public class Test20 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("abc");
		Matcher matcher = pattern.matcher("abcabcabcdefabc");
		System.out.println(matcher.find());
		System.out.println(matcher.group() + "(" + matcher.start() + "," + (matcher.end() - 1) + ")");
		System.out.println(matcher.find());//第二次查找是将上一次匹配成功的部分“截取”掉之后用剩余的子序列去匹配，下同
		System.out.println(matcher.group() + "(" + matcher.start() + "," + (matcher.end() - 1) + ")");
		System.out.println(matcher.find());
		System.out.println(matcher.group() + "(" + matcher.start() + "," + (matcher.end() - 1) + ")");
		System.out.println(matcher.find());
		System.out.println(matcher.group() + "(" + matcher.start() + "," + (matcher.end() - 1) + ")");
	}
}

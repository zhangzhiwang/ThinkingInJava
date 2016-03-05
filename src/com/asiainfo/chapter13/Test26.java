package com.asiainfo.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Matcher的start()、end()和group()方法必须在调用find()方法之后调用
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月5日 下午9:48:30
 */
public class Test26 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("abc");
		Matcher matcher  = pattern.matcher("def");
		System.out.println(matcher.group());//java.lang.IllegalStateException: No match found
//		System.out.println(matcher.start());//java.lang.IllegalStateException: No match available
//		System.out.println(matcher.end());// java.lang.IllegalStateException: No match available
	}
}

package com.asiainfo.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Matcher的lookingAt()方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 上午11:26:01
 */
public class Test27 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("A\\w*");
		Matcher matcher = pattern.matcher("dbcdefAhj");
		while (matcher.lookingAt()) {//lookingAt()方法只匹配开头部分
			System.out.println(matcher.group());
			break;
		}
	}
}

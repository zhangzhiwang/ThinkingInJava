package com.asiainfo.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern.compile()的重载版本
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 下午3:14:08
 */
public class Test29 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^aBc", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
		Matcher matcher = pattern.matcher("abc has a good\naBc is no\n"
				+ "ABC is a jkl;\neclipse is a abc");//对于多行模式，行的结束以行结束符为标志
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		System.out.println("-------------");
		
		Pattern p = Pattern.compile("^aBc", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("abc has a good\naBc is no\n"
				+ "ABC is a jkl;\neclipse is a abc");//不指定多行模式，会将整个字符串的头尾作为匹配的开始和结束
		while (m.find()) {
			System.out.println(m.group());
		}
		System.out.println("----------");
		
		Matcher m2 = pattern.matcher("abc has a good. aBc is no "
				+ "ABC is a jkl;"
				+ "eclipse is a "
				+ "abc");//没有行结束符，那么整个字符串为一行
		while (m2.find()) {
			System.out.println(m2.group());
		}
	}
}

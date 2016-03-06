package com.asiainfo.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern标记
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 下午4:11:15
 */
public class Test31 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^aBc", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
		Matcher matcher = pattern.matcher("abc has a good "
				+ "aBc is no"
				+ "ABC is a jkl;"
				+ "eclipse is a abc");
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
		Pattern p = Pattern.compile("^aBc", Pattern.CASE_INSENSITIVE | Pattern.DOTALL | Pattern.MULTILINE);
		Matcher m = p.matcher("abc has a good "
				+ "aBc is no"
				+ "ABC is a jkl;"
				+ "eclipse is a abc");
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}

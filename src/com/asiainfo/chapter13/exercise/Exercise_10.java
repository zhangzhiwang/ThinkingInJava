package com.asiainfo.chapter13.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * p301练习10
 * 
 * @author zhangzw8
 * @date 2016年3月4日 下午1:10:02
 */
public class Exercise_10 {
	public static void main(String[] args) {
		for (String regex : new String[]{"^Java", "\\Breg.*", "s?", "s*", "s+", "s{4}", "s{1}.", "s{0,3}"}) {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher("Java now has regular expressions");
			while (matcher.find()) {
				System.out.println(regex + ":" + matcher.group());
			}
		}
	}
}

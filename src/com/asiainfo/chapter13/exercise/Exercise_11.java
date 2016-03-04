package com.asiainfo.chapter13.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * p301练习11
 * 
 * @author zhangzw8
 * @date 2016年3月4日 下午1:28:03
 */
public class Exercise_11 {
	public static void main(String[] args) {
		String s = "Arline ate eight apples and one orange while Anita hadn't any";
		String regex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";//[aeiou]\\b表示以元音结尾
//		System.out.println(Pattern.matches(regex, s));
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			System.out.println(matcher.group() + "(" + matcher.start() + "," + (matcher.end() - 1) + ")");
		}
	}
}

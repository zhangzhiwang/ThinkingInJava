package com.asiainfo.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Matcher的appendReplacement()和appendTail()方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 下午4:27:41
 */
public class Test32 {
	public static void main(String[] args) {
		Matcher matcher = Pattern.compile("[aeiou]").matcher("Rmgaeiou.");
		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			matcher.appendReplacement(sb, matcher.group().toUpperCase());
//			matcher.appendTail(sb);
//			System.out.println(sb.toString());
			System.out.println("-------------");
		}
		matcher.appendTail(sb);
		System.out.println(sb.toString());
	}
}

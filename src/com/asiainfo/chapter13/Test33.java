package com.asiainfo.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Matcher的reset()方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 下午4:52:49
 */
public class Test33 {
	public static void main(String[] args) {
		Matcher matcher = Pattern.compile("a\\w+,").matcher("abc,defaQQ,sgj");
		int num = 0;
		while (matcher.find()) {
			System.out.print((num++) + "\t");
			System.out.println(matcher.group());
			matcher.reset();
			if (num == 5) {
				break;
			}
		}
		matcher.reset("add,sdfsdgdfgaKKKK,sdasd");
		while(matcher.find()) {
			System.out.print(matcher.group() + "\t");
		}
	}
}

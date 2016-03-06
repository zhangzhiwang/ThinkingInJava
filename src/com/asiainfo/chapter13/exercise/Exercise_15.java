package com.asiainfo.chapter13.exercise;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

/**
 * p308练习15
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 下午5:12:03
 */
public class Exercise_15 {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("123");
			System.exit(0);
		}
		Pattern pattern = Pattern.compile(args[1], Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
		Matcher matcher = pattern.matcher("");
		List<String> list = new TextFile(args[0]);
		int num = 0;
		for (String line : list) {
			matcher.reset(line);
			while (matcher.find()) {
				System.out.println(++num + ":" + matcher.group() + " at " + (matcher.start() + 1));
			}
		}
	}
}

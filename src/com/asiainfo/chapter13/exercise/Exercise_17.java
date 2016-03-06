package com.asiainfo.chapter13.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

/**
 * p309练习17
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 下午5:45:02
 */
public class Exercise_17 {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("error");
			System.exit(0);
		}
		
		String s = TextFile.read(args[0]);
		String regex = "(?x)(?m)/\\*(.*)\\*/|//(.*)$";
		Matcher matcher = Pattern.compile(regex).matcher(s);
		while (matcher.find()) {
			System.out.println(matcher.group(1) != null ? matcher.group(1) : matcher.group(0));
		}
	}
}

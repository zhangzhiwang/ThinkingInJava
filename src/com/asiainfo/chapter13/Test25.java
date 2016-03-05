package com.asiainfo.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Matcher的group()和group(int group)方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月5日 下午9:37:09
 */
public class Test25 {
	public static void main(String[] args) {
		String input = "Romanian woman Ortansa Pascariu \n"
				+ "is the proud owner of a very unusual piece of\n"
				+ " wardrobe - a vest made of her own hair!\n"
				+ " Ortansa had been collecting fallen strands of her hair for 20 years,\n"
				+ " and when she thought she had enough, she decided to use it for a unique garment.";
		String regex = "(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		int count = matcher.groupCount();
		System.out.println("match count:" + count);
		while (matcher.find()) {
			for (int i = 0; i <= count; i++) {
				System.out.print("[" + matcher.group(i) + "]");
			}
			System.out.println();
		}
	}
}

package com.asiainfo.chapter13.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * p303练习12
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 上午10:35:03
 */
public class Exercise_12 {
	public static void main(String[] args) {
		String input = "Romanian woman Ortansa Pascariu \n"
				+ "is the proud owner of a very unusual piece of\n"
				+ " wardrobe - a vest made of her own hair!\n"
				+ " Ortansa had been collecting fallen strands of her hair for 20 years,\n"
				+ " and when she thought she had enough, she decided to use it for a unique garment.";
		String regex = "\\b[a-z]\\w*";
		Matcher matcher = Pattern.compile(regex).matcher(input);
		Map<String, Integer> map = new HashMap<String, Integer>();
		int count = 0;
		while (matcher.find()) {
			String match = matcher.group();
			Integer value = map.get(match);
			if (value == null) {
				map.put(match, 1);
			} else {
				map.put(match, ++value);
			}
		}
		System.out.println(map);
	}
}

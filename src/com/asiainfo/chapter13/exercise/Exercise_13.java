package com.asiainfo.chapter13.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * p304练习13
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 下午1:31:51
 */
public class Exercise_13 {
	public static void main(String[] args) {
		String input = "Romanian woman Ortansa Pascariu \n"
				+ "is the proud owner of a very unusual piece of\n"
				+ " wardrobe - a vest made of her own hair!\n"
				+ " Ortansa had been collecting fallen strands of her hair for 20 years,\n"
				+ "and when she thought she had enough, she decided to use it for a unique garment.";
		for (String in : input.split("\n")) {
			System.out.println(in);
			for (String regex : new String[]{"R.*", "i.*", "w.*", "O.*", "a.*"}) {
				examine(in, regex);
				System.out.println("---------------");
			}
		}
	}
	
	private static class Display {
		private boolean flag = false;
		private String regex;
		Display(String regex) {
			this.regex = regex;
		}
		
		void display(String msg) {
			if(!flag) {
				System.out.println(regex);
				flag = true;
			}
			System.out.println(msg);
		}
	}
	
	static void examine(String s, String regex) {
		Display d = new Display(regex);
		Matcher matcher = Pattern.compile(regex).matcher(s);
		while (matcher.find()) {
			d.display("find():" + matcher.group() + "(" + matcher.start() + "," + (matcher.end() - 1) + ")");
			if (matcher.lookingAt()) {
				d.display("lookingAt():" + "(" + matcher.start() + "," + (matcher.end() - 1) + ")");
			}
			if (matcher.matches()) {
				d.display("matches():" + "(" + matcher.start() + "," + (matcher.end() - 1) + ")");
			}
		}
	}
}

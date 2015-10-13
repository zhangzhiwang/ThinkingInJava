package com.asiainfo.chapter11.exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

/**
 * p233练习16
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月13日 下午1:41:59
 */
public class Exercise_16 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(Arrays.asList("a", "e", "i", "o", "u"));
		Set<String> words = new TreeSet<String>(new TextFile("src\\com\\asiainfo\\chapter11\\exercise\\Exercise_15.java","\\W+"));
		System.out.println(words);
		
	}
}

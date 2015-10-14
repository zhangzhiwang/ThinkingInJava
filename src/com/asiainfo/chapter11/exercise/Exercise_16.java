package com.asiainfo.chapter11.exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
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
		Set<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		Set<String> words = new TreeSet<String>(new TextFile("src\\com\\asiainfo\\chapter11\\exercise\\Exercise_15.java", "\\W+"));
		System.out.println(words);

		Iterator<String> it = words.iterator();
		int total = 0;
		while (it.hasNext()) {
			String word = it.next();
			char[] letters = word.toCharArray();
			int count = 0;
			for (char c : letters) {
				if (vowels.contains(c)) {
					count++;
					total++;
				}
			}
			System.out.println("\"" + word + "\"" + " has " + count + " vowel(s).");
		}
		System.out.println("All words have " + total + " vowel(s).");
	}
}

package com.asiainfo.chapter11.exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

/**
 * p236练习20
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月26日 下午12:34:10
 */
public class Exercise_20 {
	public static void main(String[] args) {
		Set<String> vowelSet = new HashSet<String>(Arrays.asList("a", "e", "i", "o", "u"));
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 0);
		map.put("e", 0);
		map.put("i", 0);
		map.put("o", 0);
		map.put("u", 0);
		Set<String> wordsSet = new HashSet<String>(new TextFile("src\\com\\asiainfo\\chapter11\\Test42.java", "\\W+"));
		int totVewCnt = 0;
		for (String word : wordsSet) {
			int vowelCount = 0;
			Set<String> letterSet = new TreeSet<String>(Arrays.asList(word.split("")));
			for (String vowel : vowelSet) {
				if (letterSet.contains(vowel)) {
					map.put(vowel, map.get(vowel) + 1);
					vowelCount++;
					totVewCnt++;
				}
			}
			System.out.println(word + " contains " + vowelCount + " vowels.");
		}
		System.out.println("Total vowels : " + totVewCnt + ".");
		System.out.println(map);
	}
}

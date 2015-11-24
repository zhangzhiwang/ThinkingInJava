package com.asiainfo.chapter11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

/**
 * p233练习16（该练习已在exercise包下存在，这是第二次做练习，故放在此包下）
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月24日 下午1:29:54
 */
public class Test45 {
	public static void main(String[] args) {
		Set<String> vowelSet = new HashSet<String>(Arrays.asList("a","e","i","o","u"));
		Set<String> wordsSet = new HashSet<String>(new TextFile("src\\com\\asiainfo\\chapter11\\Test42.java", "\\W+"));
		int totVewCnt = 0;
		for (String word : wordsSet) {
			int vowelCount = 0;
			Set<String> letterSet = new TreeSet<String>(Arrays.asList(word.split("")));
			for (String vowel : vowelSet) {
				if (letterSet.contains(vowel)) {
					vowelCount++;
					totVewCnt++;
				}
			}
			System.out.println(word + " contains " + vowelCount + " vowels.");
		}
		System.out.println("Total vowels : " + totVewCnt + ".");
	}
}

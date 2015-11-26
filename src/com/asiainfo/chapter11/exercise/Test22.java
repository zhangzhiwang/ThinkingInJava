package com.asiainfo.chapter11.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import net.mindview.util.TextFile;

/**
 * p236练习22
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月26日 下午1:00:43
 */
public class Test22 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(new TextFile("src\\com\\asiainfo\\chapter11\\Test42.java", "\\W+"));
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		System.out.println(list);
		Set<Word> set = new LinkedHashSet<Word>();
		for (String word : list) {
			boolean flag = false;
			for (Word w : set) {
				if (w.getWord().equals(word)) {
					w.setNum(w.getNum() + 1);
					flag = true;
					break;
				}
			}
			if (!flag) {
				set.add(new Word(word, 1));
			}
		}
		for (Word w : set) {
			System.out.println(w);
		}
	}
}

class Word {
	private String word = "";
	private int num;

	public Word(String word, int num) {
		super();
		this.word = word;
		this.num = num;
	}

	public Word() {
		super();
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Word [word=" + word + ", num=" + num + "]";
	}

}
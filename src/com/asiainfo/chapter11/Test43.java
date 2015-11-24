package com.asiainfo.chapter11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

/**
 * 将文件的所有单词保存在一个Set中
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月24日 下午1:15:51
 */
public class Test43 {
	public static void main(String[] args) {
		Set<String> set1 = new TreeSet<String>(new TextFile("src\\com\\asiainfo\\chapter11\\Test42.java", "\\W+"));
		System.out.println(set1);
		
		Set<String> set2 = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		set2.addAll(new TextFile("src\\com\\asiainfo\\chapter11\\Test42.java", "\\W+"));
		System.out.println(set2);
	}
}

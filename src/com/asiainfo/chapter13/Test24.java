package com.asiainfo.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Matcher的find()和find(int start)方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月5日 下午7:53:53
 */
public class Test24 {
	public static void main(String[] args) {
		//关于Matcher的find()和find(int start)方法可详见jdk api
		String input = "My name is zzw.";
		String regex = "\\w+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
			System.out.print(matcher.group() + "\t");
		}
		System.out.println();
		
		int i = 0;
		while (matcher.find(i)) {//重置
			System.out.print(matcher.group() + "\t");
			i++;
		}
	}
}

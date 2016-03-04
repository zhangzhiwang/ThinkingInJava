package com.asiainfo.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Matcher的find()方法
 * 
 * @author zhangzw8
 * @date 2016年3月4日 上午9:35:32
 */
public class Test19 {
	public static void main(String[] args) {
		for (String regex : new String[] { "abc", "abc+", "(abc)+", "(abc){2,}" }) {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher("abcabcabcdefabc");
			while (matcher.find()) {// 第一次匹配成功后，将匹配成功的那部分“截取”掉，剩下的部分继续和正则去匹配
				System.out.println(matcher.group() + "(" + matcher.start() + "," + (matcher.end() - 1) + ")");
			}
			System.out.println("----------------------");
		}
	}
}

package com.asiainfo.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试Matcher的find()和lookingAt()
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 上午11:45:45
 */
public class Test28 {
	public static void main(String[] args) {
		Matcher matcher = Pattern.compile("a\\w+").matcher("abc,defaqw");
		int num = 0;
		while (matcher.find()) {
			num++;
			System.out.println(matcher.group());
			if (matcher.lookingAt()) {//打印结果解释不通
				System.out.println("lookingAt:" + matcher.group());
			}
			System.out.println("-------------");
			if (num == 5) {
				break;
			}
		}
	}
}

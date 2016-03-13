package com.asiainfo.chapter14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Matcher的replaceAll()方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月13日 下午2:58:28
 */
public class Test29 {
	public static void main(String[] args) {
		Matcher m = Pattern.compile("\\w+\\.").matcher("abc.def.asd");
		System.out.println(m.replaceAll("AAA"));
	}
}

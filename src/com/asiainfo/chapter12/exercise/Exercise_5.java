package com.asiainfo.chapter12.exercise;

/**
 * p253练习5
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月5日 上午1:14:16
 */
public class Exercise_5 {
	public static void main(String[] args) {
		String str = null;
		while (true) {
			try {
				System.out.println(str.length());
				break;
			} catch (Exception e) {
				str = "abc";
			}
		}
	}
}

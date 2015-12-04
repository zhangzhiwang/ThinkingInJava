package com.asiainfo.chapter12.exercise;

/**
 * p253练习3
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月5日 上午1:07:12
 */
public class Exercise_3 {
	public static void main(String[] args) {
		try {
			String[] s = new String[1];
			String str = s[1];
		} catch (ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
		}
	}
}

package com.asiainfo.chapter12.exercise;

/**
 * p253练习2
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月5日 上午1:04:55
 */
public class Exercise_2 {
	public static void main(String[] args) {
		try {
			String str = null;
			str.split("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

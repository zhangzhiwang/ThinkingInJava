package com.asiainfo.chapter12;

/**
 * p253练习2
 * 
 * @author zhangzw8
 * @date 2016年1月20日 下午1:05:08
 */
public class Test12 {
	public static void main(String[] args) {
		try {
			String str = null;
			str.length();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}

package com.asiainfo.chapter3;

import static com.asiainfo.chapter3.Print.*;

/**
 * 测试字符串操作符＋和＋＝
 * 
 * @author zhangzhiwang 2015年7月11日
 */
public class Test21 {
	public static void main(String[] args) {
		int i = 1;
		print("" + i);
		print("" + i + 1);
		print("" + (i + 1));
		print(1 + 1 + "" + 1 + 5);
		String s = "hello";
		s += " world";
		print(s);
	}
}

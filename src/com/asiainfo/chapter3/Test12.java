package com.asiainfo.chapter3;

import static com.asiainfo.chapter3.Print.*;

/**
 * 测试——Integer.parseInt(String s,int radix)
 * @author zhangzhiwang
 * 2015年7月11日
 */
public class Test12 {
	public static void main(String[] args) {
		int i = Integer.parseInt("0177", 16);
//		String i = Integer.toBinaryString(123);
		print(i);
	}
}

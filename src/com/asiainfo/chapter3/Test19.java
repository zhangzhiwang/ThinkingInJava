package com.asiainfo.chapter3;

import static com.asiainfo.chapter3.Print.*;

/**
 * 移位操作符
 * 
 * @author zhangzhiwang 2015年7月11日
 */
public class Test19 {
	public static void main(String[] args) {
		int i = 321;
		print("i = " + Integer.toBinaryString(i));
//		i = i << 2;
//		print("i = " + Integer.toBinaryString(i));
//		print("i = " + i);
//		print("---------");
		i = i >> 2;
		print("i = " + Integer.toBinaryString(i));
		print("i = " + i);
		i = 321;
		i >>>= 2;
		print("i = " + Integer.toBinaryString(i));
		print("i = " + i);
	}
}

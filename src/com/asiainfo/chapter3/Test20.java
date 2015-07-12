package com.asiainfo.chapter3;

import static com.asiainfo.chapter3.Print.*;

/**
 * p52练习11
 * 
 * @author zhangzhiwang 2015年7月11日
 */
public class Test20 {
	public static void main(String[] args) {
		int i = 0x80000000;
//		print(Long.parseLong("80000000",16));
		for (int j=0;j < String.valueOf(Integer.toBinaryString(i)).length();j++) {
			print(Integer.toBinaryString(i));
			i >>= 1;
		}
	}
}

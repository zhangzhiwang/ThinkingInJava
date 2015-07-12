package com.asiainfo.chapter3.exercices;

import static com.asiainfo.chapter3.Print.*;

/**
 * p49练习10
 * 
 * @author zhangzhiwang 2015年7月11日
 */
public class Exercise_10 {
	public static void main(String[] args) {
		int i = 170;
		int j = 85;
		print(Integer.toBinaryString(i));
		print(Integer.toBinaryString(j));
		print("i & j = " + Integer.toBinaryString(i & j));
		print("i | j = " + Integer.toBinaryString(i | j));
		print("i ^ j = " + Integer.toBinaryString(i ^ j));
		print("~i = " + Integer.toBinaryString(~i));
//		String s = "11111111111111111111111101111000";
//		print(s.length());
//		print(Integer.parseInt("0000111",2));
	}
}

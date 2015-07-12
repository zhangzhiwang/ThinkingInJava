/**
 * 
 */
package com.asiainfo.chapter4.exercise;

import static com.asiainfo.chapter3.Print.print;

/**
 * p67练习5
 * 
 * @author zhangzhiwang 2015年7月12日
 */
public class Exercise_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 170;
		int j = 85;
		print(toBinaryString(i));
		print(toBinaryString(j));
		print("i & j = " + toBinaryString(i & j));
		print("i | j = " + toBinaryString(i | j));
		print("i ^ j = " + toBinaryString(i ^ j));
		print("~i = " + toBinaryString(~i));
	}

	public static String toBinaryString(int num) {
		char[] c = new char[8];
		for (int i = c.length - 1; i >= 0; i--) {
			c[i] = (num & 1) == 0 ? '0' : '1';
			num >>>= 1;
		}
		
		return String.valueOf(c);
	}
}

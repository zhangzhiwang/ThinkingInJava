package com.asiainfo.chapter3.exercices;

import static com.asiainfo.chapter3.Print.*;

/**
 * 练习12
 * 
 * @author zhangzhiwang 2015年7月11日
 */
public class Exercice_12 {
	public static void main(String[] args) {
		int i = -1;
		print("i = " + Integer.toBinaryString(i));
		i <<= 1;
		print("i = " + Integer.toBinaryString(i));
		print("---------------");
		for (int j = String.valueOf(Integer.toBinaryString(i)).length(); j > 0; j--) {
			print(Integer.toBinaryString(i));
			i >>>= 1;
		}
	}
}

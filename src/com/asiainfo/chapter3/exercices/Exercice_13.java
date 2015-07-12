package com.asiainfo.chapter3.exercices;

import static com.asiainfo.chapter3.Print.*;

/**
 * 练习13
 * 
 * @author zhangzhiwang 2015年7月11日
 */
public class Exercice_13 {
	public static void main(String[] args) {
		print(charToBin('A'));
	}

	public static String charToBin(char c) {
		return Integer.toBinaryString(c);
	}
}

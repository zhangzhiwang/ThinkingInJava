package com.asiainfo.chapter3;

import static com.asiainfo.chapter3.Print.*;

/**
 * 测试八进制、十六进制转二进制
 * 
 * @author zhangzhiwang 2015年7月11日
 */
public class Test11 {
	public static void main(String[] args) {
		int i_16 = 0x2f;
		String s = String.valueOf(i_16);
		int i_10 = Integer.parseInt(s, 10);
		print(i_10);
		String i_2 = Integer.toBinaryString(i_16);
		print(i_2);
		print(i_16 == 0x2F);
		print(i_16 == 0X2f);
		print("------------");
		int i_8 = 0177;
		print(Integer.parseInt(String.valueOf(i_8), 10));
		print(Integer.toBinaryString(i_8));
		print("-----------");
		char c_16 = 0xffff;
		print(c_16);
		// print(Integer.parseInt(String.valueOf(c_16), 16));
		print(Integer.parseInt("ffff", 16));
		print(Integer.toBinaryString(c_16));
		print("------------");
		byte b_16 = 0x7f;
		print(Integer.parseInt("7f", 16));
		print(Integer.toBinaryString(b_16));
		print("-------------");
		short s_16 = 0x7fff;
		print(Integer.parseInt("0777", 8));
		print(Integer.toBinaryString(s_16));

		long l1 = 1L;
		long l2 = 1l;
		float f1 = 1F;
		float f2 = 1f;
		double d1 = 1D;
		double d2 = 1d;
	}
}

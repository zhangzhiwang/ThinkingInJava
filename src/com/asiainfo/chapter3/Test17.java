package com.asiainfo.chapter3;

import static com.asiainfo.chapter3.Print.*;

/**
 * 按位操作符
 * 
 * @author zhangzhiwang 2015年7月11日
 */
public class Test17 {
	public static void main(String[] args) {
		int i1 = 123;
		print(Integer.toBinaryString(i1));
		int i2 = 124;
		print(Integer.toBinaryString(i2));
		print("i1 & i2 = " + (i1 & i2));// 1111000(binary) = 120(decimal)
		print("i1 | i2 = " + (i1 | i2));// 1111111
		print("i1 ^ i2 = " + (i1 ^ i2));// 0000111
		print("i1 ^ i2 = " + Integer.toBinaryString(i1 ^ i2));// 0000111
		// print("~i1 = " + (~2));// 0000100
		print("___________________");
		int j1 = 123;
		int j2 = 124;
		print("j1 = " + j1);
		j1 &= j2;
		print("j1 = " + j1);
		j1 = 123;
		j1 |= j2;
		print("j1 = " + j1);
		j1 = 123;
		j1 ^= j2;
		print("j1 = " + j1);
		print("------------");
		int k = 1;
		print(k > 0 | k++ > 0);
		print("k = " + k);
	}
}

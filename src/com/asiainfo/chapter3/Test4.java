package com.asiainfo.chapter3;

import static com.asiainfo.chapter3.Print.*;

import java.util.Random;

/**
 * 算术运算符
 * 
 * @author zhangzhiwang 2015年7月8日
 */
public class Test4 {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		print(a + b);
		print(a - b);
		print(a * b);
		print(a / b);
		print(b % a);
		print("----------");
		print(a += b);
		print(a -= b);
		print(a *= b);
		print(b /= a);
		b = 3;
		a = 2;
		print(b %= a);
		print("=============");
		float c = 7.3f;
		float d = 2.5f;
		print(c + d);
		print(c - d);
		print(c * d);
		print(c / d);
		print(c % d);
		print("------------");
		
	}
}

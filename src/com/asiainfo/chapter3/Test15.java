package com.asiainfo.chapter3;

import static com.asiainfo.chapter3.Print.*;

/**
 * 指数计数法
 * 
 * @author zhangzhiwang 2015年7月11日
 */
public class Test15 {
	public static void main(String[] args) {
		// int i = 1e2; //编译器会将指数作为double来处理
		int i = (int) 1e2;
		print(i);
		float f = 1e-2f;
		print(f);
	}
}

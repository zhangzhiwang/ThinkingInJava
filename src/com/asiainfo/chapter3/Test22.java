package com.asiainfo.chapter3;

import static com.asiainfo.chapter3.Print.*;

/**
 * 测试while循环条件里面出现“＝”的情况
 * 
 * @author zhangzhiwang 2015年7月12日
 */
public class Test22 {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		while (b = a) {// 把a赋值给b
			print("dead loop...");
		}
	}
}

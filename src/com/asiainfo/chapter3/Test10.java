package com.asiainfo.chapter3;

import static com.asiainfo.chapter3.Print.*;

/**
 * 测试短路
 * 
 * @author zhangzhiwang 2015年7月10日
 */
public class Test10 {
	public static void main(String[] args) {
		int i = 1;
		print(1 > 2 && i++ < 1);
		print(i);
	}
}

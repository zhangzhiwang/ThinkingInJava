package com.asiainfo.chapter3;

import static com.asiainfo.chapter3.Print.*;

/**
 * 测试递增和递减
 * 
 * @author zhangzhiwang 2015年7月10日
 */
public class Test7 {
	public static void main(String[] args) {
		int i = 1;
		print(i++);
		print(i);

		i = 1;
		print(++i);
		print(i);

		i = 1;
		print(i--);
		print(i);

		i = 1;
		print(--i);
		print(i);
	}
}

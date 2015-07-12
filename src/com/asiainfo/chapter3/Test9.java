package com.asiainfo.chapter3;

import static com.asiainfo.chapter3.Print.*;

/**
 * 测试逻辑操作符
 * 
 * @author zhangzhiwang 2015年7月10日
 */
public class Test9 {
	public static void main(String[] args) {
		print(1 == 2);
		print(1 != 2);
		print(1 > 2);
		print(1 < 2);
		print(1 < 2 && 2 < 3);
		print(1 < 2 || 2 < 3);
		print(!(1 < 2));
	}
}

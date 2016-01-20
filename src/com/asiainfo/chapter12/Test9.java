package com.asiainfo.chapter12;

/**
 * 异常恢复模型
 * 
 * @author zhangzw8
 */
public class Test9 {
	private static String str;

	public static void main(String[] args) {
		int num = 0;
		while (true) {
			try {
				str.length();
				System.out.println(++num);
				break;
			} catch (Exception e) {
				str = "123";
			}
		}
	}
}

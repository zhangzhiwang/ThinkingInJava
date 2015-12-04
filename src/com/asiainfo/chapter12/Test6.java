package com.asiainfo.chapter12;

/**
 * 异常处理有两种基本模型——终止模型和恢复模型（不常用），此例为恢复模型
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月5日 上午1:01:06
 */
public class Test6 {
	private static String str = null;

	public static void main(String[] args) {
		while (true) {
			try {
				System.out.println(str.length());
				break;
			} catch (Exception e) {
				func1();
				// e.printStackTrace();
			}
			System.out.println("123");
		}
	}

	public static void func1() {
		str = "abc";
	}
}

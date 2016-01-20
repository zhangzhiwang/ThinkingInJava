package com.asiainfo.chapter12;

/**
 * p253练习5
 * 
 * @author zhangzw8
 * @date 2016年1月20日 下午1:13:28
 */
public class Test15 {
	public static void main(String[] args) {
		int i = 0;
		while (true) {
			try {
				if (i != 5) {
					throw new Exception("hello" + i);
				}
				System.out.println("world");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				i++;
			}
		}
	}
}

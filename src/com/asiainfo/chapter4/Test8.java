package com.asiainfo.chapter4;

/**
 * 循环退出语句——退出当前循环
 * 
 * @author zhangzhiwang 2015年7月13日
 */
public class Test8 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			for (int j = 1; j <= 10; j++) {
				if (j == 2) {
					continue;
				}
				System.out.println("_____" + j);
			}
		}
	}
}

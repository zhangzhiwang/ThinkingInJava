/**
 * 
 */
package com.asiainfo.chapter4.exercise;

/**
 * p67练习4
 * 
 * @author zhangzhiwang 2015年7月12日
 */
public class Exercise_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 10;
		for (int i = 3; i <= num; i++) {
			boolean flag = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				System.out.println(i);
			}
		}
		System.out.println(2);
	}

}

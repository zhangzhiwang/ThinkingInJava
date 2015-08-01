/**
 * 
 */
package com.asiainfo.chapter4;

/**
 * 标签（while loop）
 * 
 * @author zhangzhiwang 2015年7月13日
 */
public class Test10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;
		qwe: while (true) {
			System.out.println("-------");
			while (true) {
				System.out.println("i = " + i);
				i++;
				if (i == 2) {
					System.out.println("continue");
					continue;
				}

				if (i == 4) {
					System.out.println("break");
					break;
				}

				if (i == 6) {
					System.out.println("continue qwe");
					continue qwe;
				}

				if (i == 8) {
					System.out.println("break qwe");
					break qwe;
				}
			}
		}
	}

}

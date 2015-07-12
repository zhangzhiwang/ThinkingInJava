/**
 * 
 */
package com.asiainfo.chapter4.exercise;

import java.util.Random;

/**
 * p66练习2
 * 
 * @author zhangzhiwang 2015年7月12日
 */
public class Exercise_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random(1);
		for (int i = 1; i <= 25; i++) {
			int a = r.nextInt();
			int b = r.nextInt();
			System.out.println("a = " + a + ",b = " + b);
			if (a > b) {
				System.out.print("a>b" + "\t");
			} else if (a < b) {
				System.out.print("a<b" + "\t");
			} else {
				System.out.print("a=b");
			}
			System.out.println();
		}
	}

}

/**
 * 
 */
package com.asiainfo.chapter4.exercise;

import java.util.Random;

/**
 * p67练习3
 * 
 * @author zhangzhiwang 2015年7月12日
 */
public class Exercise_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random(1);
		while (true) {
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

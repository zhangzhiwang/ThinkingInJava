/**
 * 
 */
package com.asiainfo.chapter4;

/**
 * while/do-while
 * @author zhangzhiwang
 * 2015年7月12日
 */
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.print(i + "\t");
			i++;
		}
		System.out.println("exit while");
		
		i = 15;
		do {
			System.out.print(i + "\t");
//			i++;
		} while (i <= 10);
		System.out.println("exit do-while");
	}

}

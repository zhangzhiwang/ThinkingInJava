/**
 * 
 */
package com.asiainfo.chapter4;

import static com.asiainfo.chapter3.Print.*;

/**
 * if-else
 * 
 * @author zhangzhiwang 2015年7月12日
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (1 == 1) {
			print("1==1");
		}

		int i = 3;
		if (i < 3) {
			print("2 < 3");
		} else if (i > 3) {
			print("i > 3");
		} else {
			print("i == 3");
		}
	}
}

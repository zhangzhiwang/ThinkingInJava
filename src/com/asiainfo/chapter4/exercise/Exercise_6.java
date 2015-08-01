/**
 * 
 */
package com.asiainfo.chapter4.exercise;

/**
 * p69练习6
 * 
 * @author zhangzhiwang 2015年7月13日
 */
public class Exercise_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(test(3, 2, 3));
	}

	public static boolean test(int testNum, int begin, int end) {
		return (testNum >= begin && testNum <= end) ? true : false;
	}

}

/**
 * 
 */
package com.asiainfo.chapter3;

/**
 * 测试——按位异或
 * 
 * @author zhangzhiwang 2015年7月12日
 */
public class Test28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i1 = 170;
		int i2 = 85;
		System.out.println(Integer.toBinaryString(i1));
		System.out.println(Integer.toBinaryString(i2));
		System.out.println(Integer.toBinaryString(i1 ^ i1));
		System.out.println(Integer.toBinaryString(i1 ^ i2));
	}

}

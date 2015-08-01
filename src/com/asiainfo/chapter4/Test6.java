/**
 * 
 */
package com.asiainfo.chapter4;

/**
 * foreach
 * 
 * @author zhangzhiwang 2015年7月13日
 */
public class Test6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] i = new int[3];
		// 对数组元素进行赋值，要用原始for循环
//		for (int num : i) {
//			num = 1;
//		}
		for (int j = 0; j < i.length; j++) {
			i[j] = 1;
		}

		for (int num : i) {
			System.out.println(num);
		}
	}

}

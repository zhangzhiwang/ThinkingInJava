/**
 * 
 */
package com.asiainfo.chapter3;

import static com.asiainfo.chapter3.Print.*;

/**
 * 类型转换
 * 
 * @author zhangzhiwang 2015年7月12日
 */
public class Test23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double d1 = 0.7;
		double d2 = Double.MAX_VALUE;
		print((int) d1);//去尾
		print(Math.round(d1));
		print(Double.MAX_VALUE);
		print((int) d2);
	}

}

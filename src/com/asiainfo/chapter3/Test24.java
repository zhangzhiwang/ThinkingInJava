package com.asiainfo.chapter3;

/**
 * 位运算符操作boolean类型
 * 
 * @author zhangzhiwang 2015年7月12日
 */
public class Test24 {
	public static void main(String[] args) {
		boolean b = true;
		boolean a = !b;
		// boolean a = ~b; ／／位运算符——非（～）不能操作boolean类型
		boolean c = a | b;
		boolean d = a ^ b;
		System.out.println(true ^ true ^ false ^ false);// 奇数个true结果才为true
	}
}

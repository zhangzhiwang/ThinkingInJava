package com.asiainfo.chapter13;

/**
 * regex
 * 
 * @author zhangzw8
 * @date 2016年2月25日 下午10:36:21
 */
public class Test12 {
	public static void main(String[] args) {
		System.out.println("123".matches("-?\\d+"));
		System.out.println("+1".matches("\\+\\d"));
		System.out.println("123".matches("(\\+|-)?\\d+"));
	}
}

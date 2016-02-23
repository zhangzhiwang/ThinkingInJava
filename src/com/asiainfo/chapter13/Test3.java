package com.asiainfo.chapter13;

/**
 * java中只有两个重载过的操作符+、+=，并且用于String，除此之外没有其他重载过的操作符
 * 
 * @author zhangzw8
 * @date 2016年2月2日 下午12:53:22
 */
public class Test3 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = s1 + "world";
		System.out.println(s1);//并没有改变s1的值
		System.out.println(s2);
		s1 += "123";
		System.out.println(s1);
		
//		String s3 = s1 - "o";
//		s1 -= "o";
	}
}

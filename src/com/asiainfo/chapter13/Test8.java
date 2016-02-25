package com.asiainfo.chapter13;

/**
 * 值传递和引用传递
 * 
 * @author zhangzw8
 * @date 2016年2月25日 下午1:14:34
 */
public class Test8 {
	public static void main(String[] args) {
		F f1 = new F();
		F f2 = met1(f1);
		System.out.println(f1 == f2);
		
		String s1 = "hello";
		String s2 = met2(s1);
		String s5 = met3(s1);
		System.out.println(s1 == s2);
		System.out.println(s1 == s5);
		
		String s3 = new String("world");
		String s4 = met2(s3);
		System.out.println(s3 == s4);
	}
	
	public static F met1(F f) {
		return f;
	}
	
	public static String met2(String s) {
		return s;
	}
	
	public static String met3(String s) {
		s += "1";
		return s;
	}
}

class F {}
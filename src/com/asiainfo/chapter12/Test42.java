package com.asiainfo.chapter12;

/**
 * finally总会被执行指的是当代码运行到try块内部以后
 * 
 * @author zhangzw8
 * @date 2016年1月31日 下午12:21:56
 */
public class Test42 {
	public static void main(String[] args) {
		String s = null;
		s.length();//代码还没有运行到try块内部，finally不会执行
		try {
			System.out.println("hello");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("world");
		}
	}
}

package com.asiainfo.chapter12.exercise;

/**
 * p253练习1
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月5日 上午1:02:01
 */
public class Exercise_1 {
	public static void main(String[] args) {
		try {
			throw new Exception("hello");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("world");
		}
	}
}

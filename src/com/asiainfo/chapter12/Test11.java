package com.asiainfo.chapter12;

/**
 * p253练习1
 * 
 * @author zhangzw8
 * @date 2016年1月20日 下午12:59:19
 */
public class Test11 {
	public static void main(String[] args) {
		try {
			System.out.println("1");
			throw new Test10("msg");
		} catch (Test10 e) {
			e.printStackTrace();
		} finally {
			System.out.println("2");
		}
	}
}

package com.asiainfo.chapter12;

/**
 * 前面的catch块捕获异常之后后面的catch块就不会执行了
 * 
 * @author zhangzw8
 * @date 2016年1月21日 下午1:27:05
 */
public class Test21 {
	public static void main(String[] args) {
		try {
			String str = null;
			str.length();
		} catch (NullPointerException e) {
			System.out.println("123");
		} catch (Exception e) {
			System.out.println("456");
		}
	}
}

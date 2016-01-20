package com.asiainfo.chapter12;

/**
 * p253练习3
 * 
 * @author zhangzw8
 * @date 2016年1月20日 下午1:07:06
 */
public class Test13 {
	public static void main(String[] args) {
		try {
			int[] ins = new int[0];
			int i = ins[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}

package com.asiainfo.chapter13;

import java.util.Formatter;

/**
 * String.format()
 * 
 * @author zhangzw8
 * @date 2016年2月25日 下午9:45:42
 */
public class Test11 {
	public static void main(String[] args) {
		System.out.println(String.format("%d", 1));//String的format()方法不自带打印功能
		Formatter f = new Formatter(System.err);
		f.format("%f", 1.2);//Formatter的format()方法自带打印功能
	}
}

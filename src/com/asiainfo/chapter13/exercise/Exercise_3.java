package com.asiainfo.chapter13.exercise;

import java.util.Formatter;

/**
 * p291练习3
 * 
 * @author zhangzw8
 * @date 2016年2月25日 下午8:05:02
 */
public class Exercise_3 {
	public static void main(String[] args) {
		Formatter f = new Formatter(System.err);
		met1(f, 1.3);
	}

	public static void met1(Formatter f, double d) {
		f.format("The price is %f.", d);
	}
}

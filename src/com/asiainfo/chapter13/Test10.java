package com.asiainfo.chapter13;

import java.util.Formatter;

/**
 * Formatter类
 * 
 * @author zhangzw8
 * @date 2016年2月25日 下午7:58:18
 */
public class Test10 {
	public static void main(String[] args) {
		Formatter f1 = new Formatter(System.out);
		met1(f1, "everyone", 27, 13);
	}

	public static void met1(Formatter f, String name, int i1, int i2) {
		f.format("hello %s,I'm %d years old and My lucky number is %d.", name, i1, i2);
	}

}

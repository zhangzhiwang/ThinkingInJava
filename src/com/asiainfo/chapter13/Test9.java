package com.asiainfo.chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * format()方法
 * 
 * @author zhangzw8
 * @date 2016年2月25日 下午7:36:34
 */
public class Test9 {
	public static void main(String[] args) throws FileNotFoundException {
//		PrintStream p = new PrintStream(new File(""));
//		p.format("", 1);
//		PrintWriter p1 = new PrintWriter(new File(""));
//		p1.format("", 1);
		System.out.format("%d,%f\n", 1, 2.1);//format()方法可用于System.out、PrintStream、PrintWriter
		System.out.printf("%d:%f", 3, 3.1);
	}
}

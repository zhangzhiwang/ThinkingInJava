package com.asiainfo.chapter13;

import java.util.Scanner;

/**
 * Scanner的默认定界符是空格（对每一行来说）
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 下午7:25:21
 */
public class Test37 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner("123,456,789|135;246:890\n123 456 789|135;246:890");//每一行默认按空格来定界
		while (scanner.hasNext()) {
			System.out.print(scanner.next() + "\t");
		}
		System.out.println();
		System.out.println(scanner.delimiter().toString());
	}
}

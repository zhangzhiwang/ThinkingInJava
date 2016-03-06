package com.asiainfo.chapter13;

import java.util.Scanner;

/**
 * Scanner
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 下午6:45:59
 */
public class Test34 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner("ZZW\n27 1.6");
//		while (scanner.hasNext()) {
//			System.out.println(scanner.next());
//		}
//		System.out.println("------------");
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextInt());
		System.out.println(scanner.nextDouble());
		System.out.println(scanner.ioException());
	}
}

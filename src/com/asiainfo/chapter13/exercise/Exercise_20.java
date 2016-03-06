package com.asiainfo.chapter13.exercise;

import java.util.Scanner;

/**
 * p310练习20
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 下午6:55:37
 */
public class Exercise_20 {
	private int i;
	private long l;
	private float f;
	private double d;
	private String s;
	
	public Exercise_20(String s) {
		Scanner scanner = new Scanner(s);
		i = scanner.nextInt();
		l = scanner.nextLong();
		f = scanner.nextFloat();
		d = scanner.nextDouble();
		this.s = scanner.next();
	}
	
	public Exercise_20() {}
	
	@Override
	public String toString() {
		return "Exercise_20 [i=" + i + ", l=" + l + ", f=" + f + ", d=" + d
				+ ", s=" + s + "]";
	}



	public static void main(String[] args) {
		System.out.println(new Exercise_20("1 2 3.4 5.6 zzw"));
	}
}

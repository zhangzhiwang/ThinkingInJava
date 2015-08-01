package com.asiainfo.chapter4.exercise;

import java.util.Random;

/**
 * 练习9
 * 
 * @author zhangzhiwang 2015年7月14日
 */
public class Exercise_9 {
	public static void main(String[] args) {
		for (int i : flibonacci(5)) {
			System.out.print(i + "\t");
		}
	}

	public static int[] flibonacci(int num) {
		int[] flibonacci = new int[num];
		flibonacci[0] = flibonacci[1] = new Random().nextInt(3) + 1;
		for (int i = 2; i < num; i++) {
			flibonacci[i] = flibonacci[i - 1] + flibonacci[i - 2];
		}
		return flibonacci;
	}
}

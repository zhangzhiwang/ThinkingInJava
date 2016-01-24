package com.asiainfo.chapter12.exercise;

/**
 * p264练习12
 * 
 * @author zhangzw8
 * @date 2016年1月23日 上午10:39:01
 */
public class Exercise_12 {
	private int[] ins;
	private int index;

	public Exercise_12() {
	}

	public Exercise_12(int size) {
		ins = new int[size];
	}

	public int add(int i) {
		if (index >= ins.length) {
			throw new RuntimeException("超出容量界限！");
		}
		ins[index++] = i;
		return i;
	}

	public static void main(String[] args) {
		Exercise_12 e = new Exercise_12(3);
		for (int i = 0; i <= 3; i++) {
			System.out.println(e.add(i));
		}
	}
}

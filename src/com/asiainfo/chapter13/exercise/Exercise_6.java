package com.asiainfo.chapter13.exercise;

/**
 * p295练习6
 * 
 * @author zhangzw8
 * @date 2016年2月25日 下午9:54:05
 */
public class Exercise_6 {
	private int i;
	private long l;
	private float f;
	private double d;

	public Exercise_6() {
	}

	public Exercise_6(int i, long l, float f, double d) {
		this.i = i;
		this.l = l;
		this.f = f;
		this.d = d;
	}

	@Override
	public String toString() {
		return String.format("hello:%d\t%d\t%f\t%f", i, l, f, d);
	}

	public static void main(String[] args) {
		Exercise_6 e = new Exercise_6(1, 2, 3.4f, 5.6);
		System.out.println(e);
	}

}

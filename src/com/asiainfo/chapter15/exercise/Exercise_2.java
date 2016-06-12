package com.asiainfo.chapter15.exercise;

/**
 * p354练习2
 *
 * @author zhiwangzhang
 * @date 2016年6月12日 下午9:45:39
 */
public class Exercise_2<T> {
	private T t1;
	private T t2;
	private T t3;

	public Exercise_2() {
	}

	public Exercise_2(T t1, T t2, T t3) {
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}

	public T getT2() {
		return t2;
	}

	public void setT2(T t2) {
		this.t2 = t2;
	}

	public T getT3() {
		return t3;
	}

	public void setT3(T t3) {
		this.t3 = t3;
	}

	public static void main(String[] args) {
		Exercise_2<Integer> e = new Exercise_2<Integer>(1, 2, 3);
		System.out.println(e.getT1() + "," + e.getT2() + "," + e.getT3());
	}
}

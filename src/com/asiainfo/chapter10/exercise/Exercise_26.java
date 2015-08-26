package com.asiainfo.chapter10.exercise;

/**
 * p212练习26
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月26日 上午8:37:44
 */
public class Exercise_26 {
	public Exercise_26() {
		System.out.println("Exercise_26()");
	}
	class AA extends FF.FF1 {
		public AA(FF ff) {
			ff.super(1);
			System.out.println("AA(FF ff)");
		}
	}
	
	public static void main(String[] args) {
		Exercise_26 e = new Exercise_26();
		FF ff = new FF();
		e.new AA(ff);
	}
}

class FF {
	public FF() {
		System.out.println("FF()");
	}
	class FF1 {
		public FF1(int i) {
			System.out.println("FF1(int i)");
		}
	}
}

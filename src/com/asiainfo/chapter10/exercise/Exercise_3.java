package com.asiainfo.chapter10.exercise;

/**
 * p192练习3
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月19日 下午2:51:29
 */
public class Exercise_3 {
	private String s;
	
	public Exercise_3(String s) {
		this.s = s;
	}
	
	public Exercise_3() {}
	
	public Inner getInner() {
		return new Inner();
	}
	
	public class Inner {
		public String toString() {
			return s;
		}
	}
	
	public static void main(String[] args) {
		Inner i = new Exercise_3("hello").getInner();
		System.out.println(i.toString());
	}
}

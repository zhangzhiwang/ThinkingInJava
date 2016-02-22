package com.asiainfo.chapter12.exercise;

/**
 * p281练习28
 * 
 * @author zhangzw8
 * @date 2016年2月22日 上午11:56:46
 */
public class Exercise_28 {
	public static void main(String[] args) {
		throw new L("hello");
	}
}

class L extends RuntimeException {
	private String s;
	
	public L() {}
	
	public L(String s) {
		this.s = s;
	}
	
	public String getS() {
		return s;
	}
}

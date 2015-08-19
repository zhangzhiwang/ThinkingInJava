package com.asiainfo.chapter10.exercise;

/**
 * p191练习1
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月19日 下午2:48:24
 */
public class Exercise_1 {
	public static void main(String[] args) {
		Outer.Inner i = new Outer().getInner();
	}
}

class Outer {
	class Inner {
		
	}
	
	public Inner getInner() {
		return new Inner();
	}
	
	public static void main(String[] args) {
		Inner i = new Outer().getInner();
	}
}

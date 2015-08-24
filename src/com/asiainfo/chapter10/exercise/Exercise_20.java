package com.asiainfo.chapter10.exercise;

/**
 * p203练习20
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 下午5:19:59
 */
public class Exercise_20 implements O {
	public static void main(String[] args) {
		P p = new P();
	}
}

interface O {
	class P {
		public void func1() {
			System.out.println("O.P.func1()");
		}
	}
	
	
}
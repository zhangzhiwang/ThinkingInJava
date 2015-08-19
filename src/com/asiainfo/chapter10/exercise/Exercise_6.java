package com.asiainfo.chapter10.exercise;

import com.asiainfo.chapter10.exercise.package1.A;
import com.asiainfo.chapter10.exercise.package2.B;

/**
 * p195练习6
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月19日 下午4:12:19
 */
public class Exercise_6 extends B {
	public A get() {
		return new Inner();
	}
	
	public static void main(String[] args) {
		new Exercise_6().get().func1();
	}
}

package com.asiainfo.chapter10.exercise;

import com.asiainfo.chapter10.exercise.Outer1.Inner;

/**
 * p194练习5
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月19日 下午3:41:22
 */
public class Exercise_5 {
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		Inner i1 = o.new Inner();// 注意上面的import语句
		Outer1.Inner i2 = o.new Inner();
	}
}

class Outer1 {
	public class Inner {}
}
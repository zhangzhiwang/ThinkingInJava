package com.asiainfo.chapter7.exercise;

import com.asiainfo.chapter7.Test12;

/**
 * p138练习14
 * 
 * @author zhangzhiwang 2015年8月8日
 */
public class Exercise_14 {

}

class Car2 {
	private Engine2 e;

	public Car2() {
		e = new Engine2();
	}

	public static void main(String[] args) {
		new Car2().e.service();
	}
}

class Engine2 {
	public void service() {
		System.out.println("Engine2.service()");
	}
}

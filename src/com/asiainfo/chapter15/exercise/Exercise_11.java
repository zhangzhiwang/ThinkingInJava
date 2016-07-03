package com.asiainfo.chapter15.exercise;

import java.util.HashMap;
import java.util.Map;

/**
 * p363练习11
 *
 * @author zhiwangzhang
 * @date 2016年7月3日 上午11:48:31
 */
public class Exercise_11 {
	public static <A, B> Map<A, B> getMap() {
		return new HashMap<A, B>();
	}
	
	public static void main(String[] args) {
		Map<Exercise_11_1, Exercise_11_2> map = getMap();
	}
}

class Exercise_11_1 {}

class Exercise_11_2 {}
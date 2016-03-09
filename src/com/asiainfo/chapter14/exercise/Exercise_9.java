package com.asiainfo.chapter14.exercise;

import java.lang.reflect.Field;

/**
 * p318练习9
 * 
 * @author zhangzw8
 * @date 2016年3月9日 下午1:23:11
 */
public class Exercise_9 {
	private int i;
	private String s;
	
	public void met1(Object o) {
		Field[] fs = o.getClass().getDeclaredFields();
		for (Field f : fs) {
			System.out.println(f.getName());
		}
	}
	
	public static void main(String[] args) {
		Exercise_9 e = new Exercise_9();
		e.met1(e);
	}
}

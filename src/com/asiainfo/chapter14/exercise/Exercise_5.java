package com.asiainfo.chapter14.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * p318练习5
 * 
 * @author zhangzw8
 * @date 2016年3月9日 上午11:02:15
 */
public class Exercise_5 {
	public static void main(String[] args) {
		List<I> list = new ArrayList<I>(Arrays.asList(new I1(), new I2(), new I3()));
		for (I i : list) {
			rotate(i);
		}
	}
	
	public static void rotate(I i) {
		if (i instanceof I3) {//此判断是为Exercise_5准备的
			return;
		}
		i.met1();
	}
}

class I3 extends I {
	public void met1() {
		System.out.println("I3");
	}
}
package com.asiainfo.chapter14.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * p318练习4
 * 
 * @author zhangzw8
 * @date 2016年3月9日 上午10:36:29
 */
public class Exercise_4 {
	public static void main(String[] args) {
		List<I> list = new ArrayList<I>(Arrays.asList(new I1(), new I2()));
		for (I i : list) {
			if (i instanceof I1) {
				I1 i1 = (I1) i;
				i1.met1();
			}
			if (i instanceof I2) {
				I2 i2 = (I2) i;
				i.met1();
			}
		}
	}
}

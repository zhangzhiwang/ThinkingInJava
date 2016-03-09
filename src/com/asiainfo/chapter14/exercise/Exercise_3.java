package com.asiainfo.chapter14.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * p318练习3
 * 
 * @author zhangzw8
 * @date 2016年3月9日 上午9:27:20
 */
public class Exercise_3 {
	public static void main(String[] args) {
		List<I> list = new ArrayList<I>(Arrays.asList(new I1(), new I2()));
//		for (I i : list) {
//			i.met1();
//		}
		
		for (int i = 0; i <= 1; i++) {
			if (i == 0) {
				I1 i1 = (I1) list.get(i);
				i1.met1();
			}
			
			if (i == 1) {
				I1 i2 = (I1) list.get(i);
				i2.met1();
			}
		}
	}
}

class I1 extends I {
	public void met1() {
		System.out.println("I1");
	}
}
class I2 extends I {
	public void met1() {
		System.out.println("I2");
	}
}
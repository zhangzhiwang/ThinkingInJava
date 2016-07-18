package com.asiainfo.chapter15.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * p391练习27
 * 
 * @author zhangzw8
 * @date 2016年7月18日 上午9:45:35
 */
public class Exercise_27 {
	public static void main(String[] args) {
		Number[] ns = new Integer[1];//多态
//		ArrayList<Number> list = new ArrayList<Integer>();//Type mismatch: cannot convert from ArrayList<Integer> to ArrayList<Number>
		System.out.println(new Integer[1] instanceof Number[]);
		//Integer[]是Number[]的子类，但ArrayList<Number>不是ArrayList<Integer>的子类
	}
}
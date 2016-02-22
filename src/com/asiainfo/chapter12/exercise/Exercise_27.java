package com.asiainfo.chapter12.exercise;

/**
 * p281练习27
 * 
 * @author zhangzw8
 * @date 2016年2月22日 上午9:36:30
 */
public class Exercise_27 {
	public static void main(String[] args) {
		try {
			func1();
		} catch (RuntimeException e) {
//			e.getCause().printStackTrace();//可以看一下本行代码和下行代码有什么不同
			e.printStackTrace();
		}
	}

	public static void func1() {
		try {
			int[] ii = new int[0];
			int i = ii[0];
		} catch (RuntimeException e) {
			System.out.println("some other code...");
			throw new RuntimeException(e);
		}

	}
}

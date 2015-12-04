package com.asiainfo.chapter12;

/**
 * 对于终止模型如何理解“终止”
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月5日 上午1:33:03
 */
public class Test7 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			String str = null;
			str.length();// 所谓“终止”是指在try块之内异常抛出点之后的代码将不会执行，而并不影响try块之外的代码
			System.out.println("hello");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(2);
		System.out.println(3);
	}
}

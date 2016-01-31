package com.asiainfo.chapter12.exercise;

/**
 * p275练习22
 * 
 * @author zhangzw8
 * @date 2016年1月31日 下午2:31:29
 */
public class Exercise_22 {
	public static void main(String[] args) {
		try {
			FaillingConstructor f = new FaillingConstructor();
		} catch (A a) {
			a.printStackTrace();
		}
	}
}

class FaillingConstructor {
	public FaillingConstructor() throws A {
	}
}
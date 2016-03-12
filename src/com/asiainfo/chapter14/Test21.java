package com.asiainfo.chapter14;

/**
 * Class的isInstance()方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月12日 下午1:44:07
 */
public class Test21 {
	public static void main(String[] args) {
		Class c = Test21.class;
		System.out.println(c.isInstance(new Test21()));
	}
}

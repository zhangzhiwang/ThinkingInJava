package com.asiainfo.chapter6;

import com.asiainfo.chapter6.debug.*;

/**
 * protected——继承访问权限
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月6日
 */
public class Test4 extends Father {
	public static void main(String[] args) {
		Test4 t = new Test4();
		// System.out.println(t.age);
		System.out.println(t.name);
	}
}

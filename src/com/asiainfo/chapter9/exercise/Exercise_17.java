package com.asiainfo.chapter9.exercise;

/**
 * 
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月18日 下午3:52:18
 */
public interface Exercise_17 {
	int i = 1;
}

class U {
	public void func1() {
		System.out.println(Exercise_17.i);// 接口成员变量默认是static的
//		Exercise_17.i = 2;// The final field Exercise_17.i cannot be assigned 接口成员变量默认是final的
	}
}
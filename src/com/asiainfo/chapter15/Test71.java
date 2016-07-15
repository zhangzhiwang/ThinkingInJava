package com.asiainfo.chapter15;

/**
 * 在数组中添加异构类型
 * 
 * @author zhangzw8
 * @date 2016年7月15日 上午9:58:11
 */
public class Test71 {
	public static void main(String[] args) {
		Test69_1[] test69_1s = new Test69_1[10];
		test69_1s[0] = new Test69_1();
		test69_1s[1] = new Test69_1_1();
//		test69_1s[2] = (Test69_1) new Test69();//编译可通过，运行时抛异常：java.lang.ClassCastException: com.asiainfo.chapter15.Test69 cannot be cast to com.asiainfo.chapter15.Test69_1
		
		Test69[] test69_1s2 = new Test69_1[10];
	}
}

package com.asiainfo.chapter15;

/**
 * 向下转型
 * 
 * @author zhangzw8
 * @date 2016年7月15日 上午9:18:51
 */
public class Test69 {
	public static void main(String[] args) {
//		Test69 test69 = new Test69();
//		Test69_1 test69_1 = (Test69_1) test69;//java.lang.ClassCastException: com.asiainfo.chapter15.Test69 cannot be cast to com.asiainfo.chapter15.Test69_1
//		m1(test69);//java.lang.ClassCastException: com.asiainfo.chapter15.Test69 cannot be cast to com.asiainfo.chapter15.Test69_1
		
		Test69 test69 = new Test69_1();
//		Test69_1 test69_1 = (Test69_1) test69;
		m1(test69);
		Test69_1 t1 = new Test69_1();
		System.out.println(t1 instanceof Test69);
	}
	
	public static Test69_1 m1(Test69 t) {
		return (Test69_1) t;
	}
}

class Test69_1 extends Test69 {}

class Test69_1_1 extends Test69_1 {}

class Test69_2 extends Test69 {}
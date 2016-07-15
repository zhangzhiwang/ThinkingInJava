package com.asiainfo.chapter15;

/**
 * 数组的向下转型
 * 
 * @author zhangzw8
 * @date 2016年7月15日 上午9:36:55
 */
public class Test70 {
	public static void main(String[] args) {
		Test69_1[] test69_1s = new Test69_1[1];
		System.out.println(test69_1s instanceof Test69[]);
		Test69[] test69s = test69_1s;
		m1(test69s);
	}
	
	public static Test69_1[] m1(Test69[] test69s) {
		return (Test69_1[]) test69s;
	}
}

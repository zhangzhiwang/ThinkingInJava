package com.asiainfo.chapter15;

/**
 * A是B的子类，那么A[]也是B[]的子类
 *
 * @author zhiwangzhang
 * @date 2016年7月16日 上午11:10:19
 */
public class Test72 {
	public static void main(String[] args) {
		System.out.println(new Test72_1() instanceof Test72);
		System.out.println(new Test72_1[1] instanceof Test72[]);
	}
}

class Test72_1 extends Test72 {}
package com.asiainfo.chapter12;

/**
 * 异常匹配
 * 
 * @author zhangzw8
 * @date 2016年2月18日 上午9:19:46
 */
public class Test44 {
	public static void main(String[] args) {
		try {
			throw new J1();
		} catch (J1 j1) {
			System.out.println("Caught J1.");
		} catch (J j) {
			System.out.println("Caught J.");
		}

		try {
			throw new J1();
		} catch (J j) {
			System.out.println("Caught J-J1.");
		}

//		try {
//			throw new J();
//		} catch (J j) {
//			System.out.println("world.");
//		} catch (J1 j1) {}//Unreachable catch block for J1. It is already handled by the catch block for J
		
//		throw new J();//Unhandled exception type J    自定义异常属于受检异常
	}
}

class J extends Exception {
}

class J1 extends J {
}
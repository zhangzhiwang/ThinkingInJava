package com.asiainfo.chapter12;

/**
 * 重新抛出异常
 * 
 * @author zhangzw8
 * @date 2016年1月21日 下午1:31:23
 */
public class Test22 {

	public static void func1() throws Exception {
		try {
			String str = null;
			str.length();
		} catch (Exception e) {
			System.out.println("func1 catches.");
			e.printStackTrace();
			throw e;// 将异常重新抛出，而且是原封不动地抛出，可以详见课本p258倒数第二段的描述
		}
	}

	public static void main(String[] args) {
		try {
			func1();
		} catch (Exception e) {
			System.out.println("main catches.");
			e.printStackTrace();
		}
	}
}

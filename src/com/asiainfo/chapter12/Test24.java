package com.asiainfo.chapter12;

/**
 * 捕获异常后抛出新异常——愿异常抛出点信息丢失
 * 
 * @author zhangzw8
 * @date 2016年1月21日 下午1:49:09
 */
public class Test24 {
	public static void func1() throws Exception {
		try {
			String s = null;
			s.length();//该异常抛出点信息丢失
		} catch (Exception e) {
			throw new F();// 效果类似于Throwable的fillInStackTrace()方法
		}
	}

	public static void main(String[] args) {
		try {
			func1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class F extends Exception {
}
package com.asiainfo.chapter12;

/**
 * Throwable的fillInStackTrace()方法
 * 
 * @author zhangzw8
 * @date 2016年1月21日 下午1:44:53
 */
public class Test23 {
	public static void func1() throws Exception {
		try {
			String str = null;
			str.length();
		} catch (Exception e) {
			System.out.println("func1 catches.");
			e.printStackTrace();
			throw (Exception) e.fillInStackTrace();// 在异常堆栈跟踪中填充。此方法在 Throwable 对象信息中记录有关当前线程堆栈帧的当前状态。
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

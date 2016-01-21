package com.asiainfo.chapter12;

/**
 * 栈轨迹从上到下为被调用和调用关系，其中轨迹最上面的为异常抛出处
 * 
 * @author zhangzw8
 * @date 2016年1月21日 下午1:08:04
 */
public class Test20 {
	public static void func1() {
		String str = null;
		str.length();
	}

	public static void func2() {
		func1();
	}

	public static void func3() {
		func2();
	}

	public static void main(String[] args) {
		func3();
	}
}

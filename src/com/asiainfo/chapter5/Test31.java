package com.asiainfo.chapter5;

/**
 * 枚举
 * 
 * @author zhangzhiwang 2015年8月5日
 */
public enum Test31 {
	// 具名值要放在枚举类最开始的部分
	RED, YELLOW, BLUE;// 每个具名值都是一个常量实例，首先它是一个对象，其次它是一个常量，所以名称要大写

	public static void func() {
		for (Test31 t : Test31.values()) {
			System.out.println(t + "-->" + t.ordinal());
		}
	}

	public static void main(String[] args) {
		Test31.func();
	}

}
package com.asiainfo.chapter5;

/**
 * 给main方法传递参数——在方法调用的地方创建数组
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月5日
 */
public class Test22 {
	public static void main(String[] args) {
		Other.main(new String[] { "hello", "world" });
	}
}

class Other {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
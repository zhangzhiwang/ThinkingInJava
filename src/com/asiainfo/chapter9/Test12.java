package com.asiainfo.chapter9;

/**
 * 类（非接口）的多层继承
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月18日 下午2:50:42
 */
public class Test12 extends H11 {
	public static void main(String[] args) {
		new Test12().func1();
	}
}

class H {
	public void func1() {
		System.out.println("H");
	}
}

class H1 extends H {
}

class H11 extends H1 {
}
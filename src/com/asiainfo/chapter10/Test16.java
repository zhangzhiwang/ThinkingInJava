package com.asiainfo.chapter10;

/**
 * 匿名内部类
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月20日 上午11:28:28
 */
public class Test16 {
	public H getH() {
		return new H() {
			private int i = 1;
			
			@Override
			public void func1() {
				System.out.println("H1.func1()");
			}
		};
	}
	
	public static void main(String[] args) {
		Test16 t = new Test16();
		H h = t.getH();
		h.func1();
	}
}

class H {
	public void func1() {
		System.out.println("H.func1()");
	}
}
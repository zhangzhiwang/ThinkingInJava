package com.asiainfo.chapter10;

/**
 * 接口中的内部类
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 下午5:09:04
 */
public interface Test33 {
	class A {// 接口中的内部类默认是public static的，所以这里的A是个嵌套类
		private int i1 = 1;
		private static int i2 = 2;
		
		public void func1() {
			System.out.println("Test33.A.func1()");
		}
		
		public static void func2() {}
		
		public static void main(String[] args) {
			A a = new A();
			a.func1();
		}
	}
}

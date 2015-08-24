package com.asiainfo.chapter10;

/**
 * 嵌套类——静态内部类
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 下午4:42:37
 */
public class Test31 {
	public int i = 1;
	
	public void func1() {}
	
	public static void func3() {}
	
	static class A {
		public static int i = 1;// 嵌套类里面可以有静态成员和普通内部类
		public int i2 = 2;
		
		public static void func4() {}
		
		class B {}
		
		static class C {}
		
		public void func2() {
//			Test31.this.func1();// 嵌套类对象没有指向外围类对象的引用，所以在嵌套类中没有.this
//			i = 2;// 不能再嵌套类中访问外围泪的给静态成员
			func3();
		}
	}
	
	public static void main(String[] args) {
//		A a1 =new Test31().new A();
		A a2 =new A();// 创建嵌套类对象不需要外围类对象
	}
}

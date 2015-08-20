package com.asiainfo.chapter10;

/**
 * 匿名内部类调用父类的有参构造器原理
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月20日 下午2:35:57
 */
public class Test19 {
	public class J1 extends J {
		public J1() {
		}

		public J1(int i) {
			super(i);
			System.out.println("Test19.J1(int i)");
		}

		@Override
		public void func1() {
			System.out.println("Test19.J1.func1()");
		}
	}

	public J getJ(int i) {
		return new J1(i);
	}

	public static void main(String[] args) {
		Test19 t = new Test19();
		t.getJ(1);
	}
}
// Test18执行结果：
// J(int i)
// Test18.getJ1(int i).func1()
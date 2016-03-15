package com.asiainfo.chapter14;

/**
 * 外部类可以访问内部类的私有成员（属性和方法，包括构造方法）
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月15日 下午7:43:09
 */
public class Test31 {
	public static void main(String[] args) {
		Inner in = new Inner();// 外部类可以这样访问，其他类不行，比如R类
		System.out.println(in.i);
		in.met1();
	}

	static class Inner {
		private int i = 1;

		private Inner() {
			System.out.println("Inner");
		}

		private void met1() {
			System.out.println("met1");
		}
	}
}

class R {
	public void met2() {
		Test31 test31 = new Test31();
//		test31.new Inner();// The constructor Test31.Inner() is not visible
	}
}
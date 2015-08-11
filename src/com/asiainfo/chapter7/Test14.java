package com.asiainfo.chapter7;

/**
 * final修饰成员变量
 * 
 * @author zhangzhiwang 2015年8月9日
 */
public class Test14 {
	private static final int I_1 = (int) (Math.random() * 100);// 静态常量名字大写
	private final int i2 = (int) (Math.random() * 100);// 非静态常量名字正常
	private int i3 = 3;
	private static final B2 B_1 = new B2(1);
	private final B2 b2 = new B2(2);

	public static void main(String[] args) {
		Test14 t1 = new Test14();
		Test14 t2 = new Test14();
		Test14 t3 = new Test14();

		System.out.println(t1.I_1);
		System.out.println(t1.i2);
		System.out.println(t1.i3);
		// t1.i1 = 2;// The final field Test14.i1 cannot be assigned
		// t1.b1 = new B2();// The final field Test14.b1 cannot be assigned
		System.out.println(t2.I_1);
		System.out.println(t2.i2);
		System.out.println(t2.i3);
		// t2.i2 = 4;// The final field Test14.i2 cannot be assigned
		// t2.b2 = new B2();// The final field Test14.b2 cannot be assigned
		System.out.println(t3.I_1);
		System.out.println(t3.i2);
		t3.i3 = 5;
		System.out.println(t3.i3);
		System.out.println(t3.B_1);
		System.out.println(t3.b2);
		t3.B_1.age = 100;
		System.out.println("after b1");
		System.out.println(t3.B_1);
	}
}

class B2 {
	public int age;

	public B2(int age) {
		this.age = age;
	}

	public B2() {
	}

	@Override
	public String toString() {
		return "B2 [age=" + age + "]";
	}

}
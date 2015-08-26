package com.asiainfo.chapter10;

/**
 * 内部类可以实现“多重继承”——无论对于内部类还是外部类都相当于多重继承
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月25日 上午9:57:34
 */
public class Test38 extends S {
	private int i3 = 3;
	class A extends T {
		private int i4 = 4;
		public void func1() {
			i1 = 10;// 相当于内部类A继承了T和S
			i2 = 20;
			i3 = 30;// 内部类访问外部类的成员（前提是必须在内部类里面去访问）
			i4 = 40;
		}
	}
	
	public static void main(String[] args) {
		Test38 t = new Test38();
		A a = t.new A();
		a.i4 = 2;// 在外部类里面访问内部类的成员（要访问内部成员必须通过内部类（非嵌套类）的对象）
		a.i2 = 20;// 相当于外部类Test38继承了T和S
		a.func2();
	}
}

class T {
	int i2 = 2;
	
	public void func2() {}
}
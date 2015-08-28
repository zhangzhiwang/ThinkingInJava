package com.asiainfo.chapter10;

/**
 * 访问（普通、局部、匿名）内部类特有的方法
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月28日 上午9:36:13
 */
public class Test53 {
	class A implements LL {
		@Override
		public int next() {
			return 1;
		}

		public void func1() {
		}
	}

	public void get1() {
		class B implements LL {// 局部内部类在其所在作用域范围内是可见的，对于作用与外面是不可见的。对于本例，局部内部类B只能在get1()方法内部实例化，如果超出了get1()的作用域，就无法实例化B的对象
			@Override
			public int next() {
				return 1;
			}

			public void func2() {
			}
		}

		new B().func2();// 访问局部内部类的特有方法
	}

	public void get2() {
		new LL() {
			@Override
			public int next() {
				return 1;
			}

			public void func3() {
			}
		}.func3();// 访问匿名内部类的特有方法
	}

	public static void main(String[] args) {
		Test53 t = new Test53();
		A a = t.new A();
		a.func1();

		t.get1();
		t.get2();
	}
}
package com.asiainfo.chapter10;

/**
 * 匿名内部类的构造器就是实例初始化
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 上午10:16:34
 */
public class Test24 {
	public L getL(final M m) {
		return new L() {// 匿名内部类既可以继承类也可以实现接口，但是只能二者选其一，如果是实现接口也只能实现一个接口
			private M m1;
			private int i = 1;

			{
				m1 = m;// 构造器初始化
			}
			// 匿名内部类只能有一个构造器，改构造器不能被重载，因为它没有名字
			
			@Override
			public void func1() {
				System.out.println(m1);
				System.out.println(i);
			}
		};
	}

	public static void main(String[] args) {
		Test24 t = new Test24();
		M m = new M();
		System.out.println("m = " + m);
		t.getL(m).func1();
	}
}

class M {
	public void func1() {
		System.out.println("M.func1()");
	}
}
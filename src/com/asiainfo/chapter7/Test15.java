package com.asiainfo.chapter7;

/**
 * 空白final
 * 
 * @author zhangzhiwang 2015年8月9日
 */
public class Test15 {
	private static final int i1;
	private final int i2;
	private final int i3;
	private static final C2 c1;
	private final C2 c2;
	private final C2 c3;

	static {
		i1 = 1;
		c1 = new C2();
	}

	{
		i3 = 3;
		c3 = new C2();
	}

	public Test15(int i) {
		i2 = i;
		c2 = new C2();
	}

	public Test15() {
		i2 = 1;
		c2 = new C2();
	}

	public static void main(String[] args) {
		System.out.println("常量（静态和非静态）有三种初始化方式——定义处初始化、代码块初始化、构造方法初始化（而且是定义的每个构造方法都要对常量进行初始化）");
	}
}

class C2 {
}
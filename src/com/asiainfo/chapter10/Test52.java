package com.asiainfo.chapter10;

/**
 * 类、内部类、局部内部类、匿名内部类生成的.class文件的名称
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月28日 上午9:27:46
 */
public class Test52 {// 普通类
	class A {// 内部类
	}

	public LL get1() {
		class B implements LL {// 局部内部类
			@Override
			public int next() {
				return 1;
			}
		}
		return new B();
	}

	public LL get2() {
		return new LL() {// 匿名内部类
			@Override
			public int next() {
				return 1;
			}
		};
	}
	// 观察生成的.class文件的名称
}

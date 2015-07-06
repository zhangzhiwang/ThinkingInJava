package com.asiainfo.chapter2;

/**
 * java有8种基本数据类型，测试它们的默认值
 * @author zhangzhiwang
 * @date 2015年7月4日
 */
public class Test1 {
	byte b;
	short s;
	char c;
	int i;
	long l;
	float f;
	double d;
	boolean bo;

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		System.out.println("byte default value:" + test1.b);
		System.out.println("short default value:" + test1.s);
		System.out.println("char default value:" + test1.c);
		System.out.println("int default value:" + test1.i);
		System.out.println("long default value:" + test1.l);
		System.out.println("float default value:" + test1.f);
		System.out.println("double default value:" + test1.d);
		System.out.println("boolean default value:" + test1.bo);
		int num;
//		System.out.println(num);
		System.out.println("成员变量和局部变量都可以在定义的时候不初始化他们，只不过成员变量有默认值，可以直接使用，而局部变量没有默认值，不能直接使用。");
	}
}

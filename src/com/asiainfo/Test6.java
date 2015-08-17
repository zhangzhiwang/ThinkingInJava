package com.asiainfo;

/**
 * 多态（向上/向下转型）
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月17日 上午11:19:13
 */
public class Test6 {
	public static void main(String[] args) {
		Fa f = new So();// 多态
		f.func1();
		f.func2();
		((So)f).func3();// 向下转型
		
		GrandSon g = (GrandSon) f;
	}
}

class Fa {
	public void func1() {
		System.out.println("Fa.func1()");
	}

	public void func2() {
		System.out.println("Fa.func2()");
	}
}

class So extends Fa {
	@Override
	public void func2() {
		System.out.println("So.func2()");
	}

	public void func3() {
		System.out.println("So.func3()");
	}
}

class GrandSon extends Fa {
	public void func4() {
		System.out.println("GrandSon.func4()");
	}
}

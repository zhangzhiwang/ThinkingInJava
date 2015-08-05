package com.asiainfo.chapter5;

/**
 * 对象的创建过程以及成员变量的初始化顺序
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月5日
 */
public class Test16 {
	public static void main(String[] args) {
//		new Bowl(1);/*
//					 * 第一次new对象，会导致该对象所属的类被加载，在类加载的时候会先初始化静态成员变量（按定义的顺序）然后初始化非静态成员变量（按定义顺序）， 最后执行构造方法
//					 */
//		System.out.println("-----------------------");
//		new Bowl(2);/*在调用方法（包括构造方法）之前，先对成员变量进行初始化，顺序为：1、按照定义的先后 2、先静态后非静态（非静态属性在类加载的时候已被初始化）*/
//		Bowl.c3.toString();
		Bowl.func();
	}
}

class Cup {
	public Cup(int i) {
		System.out.println("Cup " + i);
	}
}

class Bowl {
	private Cup c1 = new Cup(1);// 成员变量的初始化顺序与静态还是非静态以及定义的顺序有关，与在类中所处的位置无关，但习惯上把属性放在方法之前

	public Bowl(int i) {
		System.out.println("Bowl " + i);
	}

	public static Table t1 = new Table(1);
	private Cup c2 = new Cup(2);
	
	public static void func() {
//		static int num = 1;// static不能修饰局部变量
		System.out.println("func()");
	}
	
	public static Cup c3 = new Cup(3);
}

class Table {
	public Table(int i) {
		System.out.println("Table " + i);
	}
}
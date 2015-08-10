package com.asiainfo.chapter7.exercise;

/**
 * p147练习24
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月10日
 */
public class Exercise_24 extends Son {
	public static Radio r1 = new Radio(3);
	public Radio r2 = new Radio(31);

	public static void main(String[] args) {
		System.out.println("-------------");
		new Exercise_24(333);
	}

	public Exercise_24() {
	}

	public Exercise_24(int i) {
		super(i);
		System.out.println("Exercise_24: " + i);
	}
}

class Father {
	public static Radio r1 = new Radio(1);
	public Radio r2 = new Radio(11);

	public Father() {
	}

	public Father(int i) {
		System.out.println("Father: " + i);
	}
}

class Son extends Father {
	public static Radio r1 = new Radio(2);
	public static Radio r3 = new Radio(22);
	public Radio r2 = new Radio(21);

	public Son() {
	}

	public Son(int i) {
		super(i);
		System.out.println("Son: " + i);
	}
}

class Radio {
	public Radio() {
	}

	public Radio(int i) {
		System.out.println("Radio: " + i);
	}
}
/*
 * 类加载及初始化详细过程：
 * 1、要执行Exercise_24的main()，首先要加载类Exercise_24。
 * 2、在加载Exercise_24时加载器发现Exercise_24继承了Son，于是就先加载Son（因为子类可能会用到父类的一些东西，所以要先加载父类并初始化其静态成员变量）
 * 3、在加载Son时发现Son继承了Father，所以先加载Father
 * 4、加载完Father就初始化Father的静态成员变量，然后加载Son并对其初始化，进而进行Exercise_24的相关工作
 * 5、在所有类加载完并完成初始化工作之后就开始执行Exercise_24的main()
 * 6、在main()中实例化了一个本类的对象（即调用public Exercise_24(int i)）
 * 7、该构造方法调用了Son的有参构造方法，而Son的该方法调用了Father的有参构造方法
 * 8、在调用Father的有参构造器之前，先初始化Father类的成员变量（静态的已初始化完成，初始化非静态变量即可），初始化完成之后就执行构造器里面的代码
 * 9、初始化Father实例之后，就开始调用Son的有参构造器，同样，先初始化非静态成员变量，在调用构造器中super(i)和面的代码
 * 10、在Son实例化之后，Exercise_24进行相关的工作。至此，程序执行结束
 */
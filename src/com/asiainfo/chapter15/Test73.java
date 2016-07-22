package com.asiainfo.chapter15;

/**
 * 在数组中添加异构类型
 *
 * @author zhiwangzhang
 * @date 2016年7月16日 上午11:12:20
 */
public class Test73 {
	public static void main(String[] args) {
		Test73[] t1 = new Test73[5];
		t1[0] = new Test73();
		t1[1] = new Test73_1();
		t1[2] = new Test73_1_1();
		t1[3] = new Test73_2();
//		t1[4] = new Test72();//Type mismatch: cannot convert from Test72 to Test73
		
		Test73_1[] t2 = new Test73_1[5];
		t2[0] = new Test73_1();
		t2[1] = new Test73_1_1();
//		t2[2] = new Test73_2();//Type mismatch: cannot convert from Test73_2 to Test73_1
		Test73 test73 = new Test73();
//		t2[2] = test73;//Type mismatch: cannot convert from Test73 to Test73_1
//		t2[2] = (Test73_1) test73;//编译能通过，运行时报java.lang.ClassCastException: com.asiainfo.chapter15.Test73 cannot be cast to com.asiainfo.chapter15.Test73_1，因为不能确定test73一定就能转换成Test73_1，必须将test73指向一个Test73_1的对象才能向下转型
		test73 = new Test73_1();
		t2[2] = (Test73_1) test73;
		
		Test73[] t3 = new Test73_1[5];
		t3[0] = new Test73_1();
		t3[1] = new Test73_1_1();
//		t3[2] = new Test73();//编译器可以通过，运行时报异常： java.lang.ArrayStoreException: com.asiainfo.chapter15.Test73
		t3[3] = new Test73_2();//编译器可以通过，运行时报异常：java.lang.ArrayStoreException: com.asiainfo.chapter15.Test73_2

		//其实这就是多态——父类的引用指向子类的对象，在多态情况下，引用只能访问父类的方法，但是执行却是子类的对象去执行的。对于t3这种情况，由于t3属于父类的引用，所以该数组能添加所有Test73及其子类的对象，但在运行时会把元素实际添加到子类数组中，所以会出现ArrayStoreException。
	}
}

class Test73_1 extends Test73 {}

class Test73_1_1 extends Test73_1 {}

class Test73_2 extends Test73 {}

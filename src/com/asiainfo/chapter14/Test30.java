package com.asiainfo.chapter14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Class的一些方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月13日 下午3:19:31
 */
public class Test30 extends Q{
	public class A{}
	
	class C {}
	
	protected class D {}
	
	interface B{}
	
	public void met1() {}
	
	protected void met2() {}
	
	void met3() {}
	
	private void met4() {}
	
	public Test30() {}
	public Test30(int i) {}
	
	protected Test30(String s) {}
	
	Test30(Integer i) {}
	
	private Test30(Class c) {}
	
	public int i1;
	public static int i2;
	public static final int I3 = 1;
	protected int i4;
	int i5;
	private int i6;
	
	public static void main(String[] args) {
		Class[] cs = Test30.class.getDeclaredClasses();//返回该Class对象所表示类的内部类（接口）的数组，不包括继承父类的内部类（接口）。    详见api
		System.out.println(cs.length);
		System.out.println(Arrays.toString(cs));
		System.out.println("-------------------");
		
		Class[] cs2 = Test30.class.getClasses();//返回该Class对象所表示类的公共内部类（接口），包括继承父类的公共内部类（接口）
		System.out.println(cs2.length);
		System.out.println(Arrays.toString(cs2));
		System.out.println("-----------------------");
		
		Method[] ms = Test30.class.getDeclaredMethods();
		System.out.println(ms.length);
		System.out.println(Arrays.toString(ms));//为什么会有met5()？
		System.out.println("--------------");
		
		Method[] ms2 = Test30.class.getMethods();//返回此Class对象所表示类（接口）和其父类（接口）所有public方法
		System.out.println(ms2.length);
		for (Method m : ms2) {
			System.out.println(m);
		}
		System.out.println("---------------------------");
		
		Constructor[] cons = Test30.class.getDeclaredConstructors();
		System.out.println(cons.length);
		System.out.println(Arrays.toString(cons));
		System.out.println("---------------------");
		
		Constructor[] cons2 = Test30.class.getConstructors();//只返回Class所表示的类所声明的public构造器，不包括其父类的
		System.out.println(cons2.length);
		System.out.println(Arrays.toString(cons2));
		System.out.println("----------------------------");
		
		Field[] fs = Test30.class.getDeclaredFields();
		System.out.println(fs.length);
		System.out.println(Arrays.toString(fs));
		System.out.println("-------------------------------");
		
		Field[] fs2 = Test30.class.getFields();//只返回public的
		System.out.println(fs2.length);
		System.out.println(Arrays.toString(fs2));
	}
}

class Q {
	public class Q1 {}
	
	public interface Q2 {}
	
	public void met5() {}
	
	protected void met6() {}
	
	void met7() {}
	
	private void met8() {}
	
	public Q () {}
	
	protected Q(int i) {}
	
	Q(String s) {}
	
	private Q(Class c) {}
	
	public int q1;
	public static int q2;
	public static final int Q3 = 1;
	protected int q4;
	int q5;
	private int q6;
}
package com.asiainfo.chapter14;

/**
 * instanceof与isInstance()方法等效
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月13日 下午1:37:36
 */
public class Test27 extends L {
	public static void main(String[] args) throws ClassNotFoundException {
		Test27 t = new Test27();
		Class c27 = Test27.class;
		Class cl = L.class;
		System.out.println(t instanceof Test27);
		System.out.println(c27.isInstance(t));
		System.out.println("------------------");
		
		System.out.println(t instanceof L);//instanceof与isInstance()方法考虑了继承的情况
		System.out.println(cl.isInstance(t));
		System.out.println("--------------------");
		
		System.out.println(Test27.class == c27);//而==和equals()方法只是比较两个对象（内容）是不是一样
		System.out.println(Test27.class.equals(c27));
		System.out.println("----------------------");
		
		System.out.println(Test27.class == cl);
		System.out.println(Test27.class.equals(cl));
		System.out.println("-----------------------");
		
		System.out.println(Class.forName("com.asiainfo.chapter14.Test27") == Test27.class);
		Class c27_2 = Test27.class;
		System.out.println(c27 == c27_2);//说明某一具体的类只有一个类型信息对象（可以理解为：某一类所对应Class对象是单例的）
	}
}

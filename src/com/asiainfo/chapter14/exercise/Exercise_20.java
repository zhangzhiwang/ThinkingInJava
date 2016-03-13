package com.asiainfo.chapter14.exercise;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

import com.asiainfo.chapter14.Test30;

/**
 * p337练习20
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月13日 下午5:20:26
 */
public class Exercise_20 {
	public static void met1(Class<?> clazz) {
		Class[] cs = clazz.getDeclaredClasses();//返回该Class对象所表示类的内部类（接口）的数组，不包括继承父类的内部类（接口）。    详见api
		System.out.println(cs.length);
		System.out.println(Arrays.toString(cs));
		System.out.println("-------------------");
		
		Class[] cs2 = clazz.getClasses();//返回该Class对象所表示类的公共内部类（接口），包括继承父类的公共内部类（接口）
		System.out.println(cs2.length);
		System.out.println(Arrays.toString(cs2));
		System.out.println("-----------------------");
		
		Method[] ms = clazz.getDeclaredMethods();
		System.out.println(ms.length);
		System.out.println(Arrays.toString(ms));//为什么会有met5()？
		System.out.println("--------------");
		
		Method[] ms2 = clazz.getMethods();//返回此Class对象所表示类（接口）和其父类（接口）所有public方法
		System.out.println(ms2.length);
		for (Method m : ms2) {
			System.out.println(m);
		}
		System.out.println("---------------------------");
		
		Constructor[] cons = clazz.getDeclaredConstructors();
		System.out.println(cons.length);
		System.out.println(Arrays.toString(cons));
		System.out.println("---------------------");
		
		Constructor[] cons2 = clazz.getConstructors();//只返回Class所表示的类所声明的public构造器，不包括其父类的
		System.out.println(cons2.length);
		System.out.println(Arrays.toString(cons2));
		System.out.println("----------------------------");
		
		Field[] fs = clazz.getDeclaredFields();
		System.out.println(fs.length);
		System.out.println(Arrays.toString(fs));
		System.out.println("-------------------------------");
		
		Field[] fs2 = clazz.getFields();//只返回public的
		System.out.println(fs2.length);
		System.out.println(Arrays.toString(fs2));
	}
	
	public static void main(String[] args) {
		met1(String.class);
	}
}

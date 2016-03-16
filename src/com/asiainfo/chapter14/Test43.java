package com.asiainfo.chapter14;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.asiainfo.chapter14.exercise.Exercise_25;

/**
 * p350练习25的另一部分
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月16日 下午8:15:05
 */
public class Test43 {
	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Exercise_25 e = new Exercise_25();
		Method m1= e.getClass().getDeclaredMethod("met1");
		m1.setAccessible(true);
		m1.invoke(e);
		
		Method m2 = e.getClass().getDeclaredMethod("met2");
		m2.setAccessible(true);
		m2.invoke(e);
		
		Method m3 = e.getClass().getDeclaredMethod("met3");
		m3.setAccessible(true);
		m3.invoke(e);
	}
}

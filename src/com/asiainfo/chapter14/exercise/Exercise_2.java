package com.asiainfo.chapter14.exercise;

import java.util.Arrays;

/**
 * p318练习2
 * 
 * @author zhangzw8
 * @date 2016年3月9日 上午9:09:58
 */
public class Exercise_2 extends I implements G, H{
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class c = Class.forName("com.asiainfo.chapter14.exercise.Exercise_2");
		Class[] cs = c.getInterfaces();
		System.out.println(Arrays.toString(cs));
		Class f = c.getSuperclass();
		System.out.println(f.getName());
		Object o = f.newInstance();
		System.out.println(o.toString());
		I i = (I) o;
		i.met1();
	}
}

interface G {}
interface H {}
class I {
	public void met1() {
		System.out.println("hello");
	}
}
package com.asiainfo.chapter15;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Array.newInstance(Class<?> componentType, int length)——创建一个具有指定的组件类型和长度的新数组
 *
 * @author zhiwangzhang
 * @date 2016年7月11日 下午8:12:29
 */
public class Test46 {
	public static void main(String[] args) {
		String[] is = (String[]) Array.newInstance(Integer.class, 5);
		System.out.println(is);//直接打印数组对象不会自动调用数组元素对象的toString()方法
		System.out.println(Arrays.toString(is));//要打印数组元素可以用Arrays.toString()方法
		
//		List<Integer> list = Arrays.asList(is);
//		System.out.println("list = " + list);//容器会自动调用元素的toString()方法
	}
}

class Test46_1<T> {
	private T[] t = (T[]) Array.newInstance(String.class, 5);//用Array.newInstance()方法创建泛型数组是推荐的方式
}
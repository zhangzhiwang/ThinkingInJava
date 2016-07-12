package com.asiainfo.chapter15;

/**
 * 泛型实例化方法一——使用类型标签Class<T>
 *
 * @author zhiwangzhang
 * @date 2016年7月12日 下午9:53:21
 */
public class Test51<T> {
//	private T t = new T();//Cannot instantiate the type T
	private T t;
	
	public Test51() {}
	
	public Test51(Class<T> cla) throws InstantiationException, IllegalAccessException {
		t = cla.newInstance();// 此方法的缺陷就是该cla所表示的类必须具有默认构造器
		System.out.println(cla.getSimpleName());
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Test51<Test50> t1 = new Test51<Test50>(Test50.class);
		Test51<Integer> t2 = new Test51<Integer>(Integer.class);//Integer没有默认构造器
	}
}

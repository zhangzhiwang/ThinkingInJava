package com.asiainfo.chapter15;

import java.lang.reflect.Array;

/**
 * 关闭警告的注解
 * 
 * @author zhangzw8
 * @date 2016年7月12日 上午8:58:23
 */
public class Test47<T> {
	private Class<T> cla;
	
	public Test47() {}
	
	public Test47(Class<T> cla) {
		this.cla = cla;
	}
	
	@SuppressWarnings("unchecked")
	public T[] create(int size) {
		return (T[]) Array.newInstance(cla, size);//Type safety: Unchecked cast from Object to T[]
	} 
}

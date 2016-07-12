package com.asiainfo.chapter15.exercise;

import java.util.HashMap;
import java.util.Map;

/**
 * p381练习21
 * 
 * @author zhangzw8
 * @date 2016年7月12日 下午1:30:35
 */
public class Exercise_21<T> {
	private Class<T> cla;
	private Map<String, Class<?>> map;

	public Exercise_21() {
	}

	public Exercise_21(Class<T> cla, Map<String, Class<?>> map) {
		this.cla = cla;
		this.map = map;
	}

	public boolean m1(Object o) {
		return cla.isInstance(o);
	}

	public void addType(String typeName, Class<?> kind) {
		map.put(typeName, kind);
	}

	public T createNew(String typename) throws InstantiationException, IllegalAccessException {
		if (map.get(typename) != null) {
			return (T) map.get(typename).newInstance();
		}
		throw new RuntimeException("err!");
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Exercise_21<Exercise_21> e = new Exercise_21<Exercise_21>(Exercise_21.class, new HashMap<String, Class<?>>());
		e.addType("Exercise_21_1", Exercise_21_1.class);
		e.addType("Exercise_21", Exercise_21.class);
		System.out.println(e.m1(e.createNew("Exercise_21_1")));
		System.out.println(e.m1(e.createNew("Exercise_21")));
	}
}

class Exercise_21_1<U> extends Exercise_21<U> {}
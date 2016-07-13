package com.asiainfo.chapter15.exercise;

import java.util.HashMap;
import java.util.Map;

/**
 * p383练习24
 * 
 * @author zhangzw8
 * @date 2016年7月13日 上午9:51:16
 */
public class Exercise_24<T> {
	private Class<T> cla;
	private Map<String, Factory<T>> map;
	
	public Exercise_24() {}
	
	public Exercise_24(Class<T> cla, Map<String, Factory<T>> map) {
		this.cla = cla;
		this.map = map;
	}
	
	public boolean m1(Object o) {
		return cla.isInstance(o);
	}
	
	public void addType(String typeName, Factory<T> fac) {
		map.put(typeName, fac);
	}

	public T createNew(String typename) throws InstantiationException, IllegalAccessException {
		if (map.get(typename) != null) {
			return (T) map.get(typename).create();
		}
		throw new RuntimeException("err!");
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Exercise_24<Exercise_24_1> e = new Exercise_24<Exercise_24_1>(Exercise_24_1.class, new HashMap<String, Factory<Exercise_24_1>>());
		e.addType("Exercise_24_1", new Factory<Exercise_24_1>(){
			@Override
			public Exercise_24_1 create() {
				return new Exercise_24_1();
			}
		});
		System.out.println(e.m1(e.createNew("Exercise_24_1")));
	}
}

interface Factory<T> {
	T create();
}

class Exercise_24_1<T> extends Exercise_24<T> {}
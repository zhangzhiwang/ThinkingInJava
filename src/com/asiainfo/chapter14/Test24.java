package com.asiainfo.chapter14;

import java.util.HashMap;

/**
 * p330代码测试（这个代码很有用），需要结合Test18和Test20以及Test22
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月12日 下午3:21:18
 */
public class Test24 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		TypeCounter tc = new TypeCounter(Pet.class);
		for (Pet pet : Pets.CREATOR.createArray(20)) {
			System.out.print(pet.getClass().getSimpleName() + "\t");
			tc.count(pet.getClass());
		}
		System.out.println();
		System.out.println(tc);
	}
}

class TypeCounter extends HashMap<Class<?>, Integer> {
	private Class<?> baseType;

	public TypeCounter(Class<?> baseType) {
		this.baseType = baseType;
	}

	public void count(Class<?> c) {
		if (c == null || !baseType.isAssignableFrom(c)) {
//			System.out.println("hello");
			return;
		}
		Integer count = get(c);
		put(c, count == null ? 1 : count + 1);
		Class<?> sc = c.getSuperclass();
		count(sc);
	}
}

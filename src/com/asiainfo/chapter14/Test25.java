package com.asiainfo.chapter14;

import java.util.HashMap;
import java.util.Map;

/**
 * p330 14.3.3 递归计数
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月12日 下午3:50:18
 */
public class Test25 {
	// 业务场景：如果符合某个条件，子类执行了某一动作，那么其所有父类都要执行某一相应动作
	private Class<?> baseType;

	public Test25() {
	}

	public Test25(Class<?> baseType) {
		this.baseType = baseType;
	}

	public void count(Class<?> clazz) {
		if (clazz == null || !baseType.isAssignableFrom(clazz)) {
			return;// 可以根据业务需要抛出异常
		}
		Map<Class<?>, Integer> map = new HashMap<Class<?>, Integer>();
		Integer count = map.get(clazz);
		map.put(clazz, count == null ? 1 : count);
		count(clazz.getSuperclass());
	}
}

class Gerbil extends Rodent {
	public Gerbil() {
	}

	public Gerbil(String name) {
		super(name);
	}
}
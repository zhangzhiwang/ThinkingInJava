package com.asiainfo.chapter14.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * p331练习13
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月13日 上午10:57:04
 */
public class Exercise_13 {
	public static void main(String[] args) {
		Counter c = new Counter(Plant.class);
		for (int i = 1; i <= 10; i++) {
			Plant p = Plant.createRandom();
			System.out.print(p + "\t");
			c.count(p.getClass());
		}
		System.out.println();
		System.out.println(c.map);
	}
}

interface Factory<T> {
	T create();
}

@SuppressWarnings("unchecked")
class Plant {
	static List<Factory2<? extends Plant>> list = new ArrayList<Factory2<? extends Plant>>();
	static Random r = new Random(47);
	
	static {
		list.add(new Cabbage().new CabbageFactory());
		list.add(new Tomato().new TomatoFactory());
		list.add(new Potato().new PotatoFactory());
		list.add(new Orange().new OrangeFactory());
		list.add(new Apple().new AppleFactory());
	}
	
	public static Plant createRandom() {
		return (Plant) list.get(r.nextInt(list.size())).create();
	}
}

class Vegetable extends Plant {
}

class Cabbage extends Vegetable {
	public class CabbageFactory implements Factory2 {
		@Override
		public Cabbage create() {
			return new Cabbage();
		}
	}
}

class Potato extends Vegetable {
	public class PotatoFactory implements Factory2 {
		@Override
		public Potato create() {
			return new Potato();
		}
	}
}

class Tomato extends Vegetable {
	public class TomatoFactory implements Factory2 {
		@Override
		public Tomato create() {
			return new Tomato();
		}
	}
}

class Fruit extends Plant {}

class Orange extends Fruit {
	public class OrangeFactory implements Factory2 {
		@Override
		public Orange create() {
			return new Orange();
		}
	}
}

class Apple extends Fruit {
	public class AppleFactory implements Factory2 {
		@Override
		public Apple create() {
			return new Apple();
		}
	}
}

class Counter {
	private Class<?> baseType;
	public Map<Class<?>, Integer> map = new HashMap<Class<?>, Integer>();
	
	public Counter() {}
	
	public Counter(Class<?> c) {
		baseType = c;
	}
	
	public void count(Class<?> clazz) {
		if (clazz == null || !baseType.isAssignableFrom(clazz)) {
			return;
		}
		Integer i = map.get(clazz);
		map.put(clazz, i == null ? 1 : i + 1);
		count(clazz.getSuperclass());
	}
}
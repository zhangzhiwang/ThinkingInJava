package com.asiainfo.chapter14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 注册工厂——工厂方法模式
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月13日 上午10:08:18
 */
public class Test26 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Plant.createRandom());
		}
	}
}

interface Factory<T> {
	T create();
}

@SuppressWarnings("unchecked")
class Plant {
	static List<Factory<? extends Plant>> list = new ArrayList<Factory<? extends Plant>>();
	static Random r = new Random(47);
	
	static {
		list.add(new Cabbage().new CabbageFactory());
		list.add(new Tomato().new TomatoFactory());
		list.add(new Potato().new PotatoFactory());
		list.add(new Orange().new OrangeFactory());
		list.add(new Apple().new AppleFactory());
	}
	
	public static Plant createRandom() {
		return list.get(r.nextInt(list.size())).create();
	}
}

class Vegetable extends Plant {
}

class Cabbage extends Vegetable {
	public class CabbageFactory implements Factory {
		@Override
		public Cabbage create() {
			return new Cabbage();
		}
	}
}

class Potato extends Vegetable {
	public class PotatoFactory implements Factory {
		@Override
		public Potato create() {
			return new Potato();
		}
	}
}

class Tomato extends Vegetable {
	public class TomatoFactory implements Factory {
		@Override
		public Tomato create() {
			return new Tomato();
		}
	}
}

class Fruit extends Plant {}

class Orange extends Fruit {
	public class OrangeFactory implements Factory {
		@Override
		public Orange create() {
			return new Orange();
		}
	}
}

class Apple extends Fruit {
	public class AppleFactory implements Factory {
		@Override
		public Apple create() {
			return new Apple();
		}
	}
}
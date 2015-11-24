package com.asiainfo.chapter11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 容器的组合
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月24日 下午9:03:51
 */
public class Test48 {
	public static void main(String[] args) {
		Map<String, List<? extends Pet>> map = new HashMap<String, List<? extends Pet>>();
		map.put("Tom", Arrays.<Pet> asList(new Dog("dog1"), new Cat("cat1")));
		map.put("Jerry", Arrays.<Pet> asList(new Pig("pig1"), new Dog("dog2")));
		map.put("Linus", Arrays.<Pet> asList(new Cat("cat2"), new Dog("dog3"),
				new Pig("pig2")));
		for (String key : map.keySet()) {
			System.out.print(key + " has ");
			for (Pet pet : map.get(key)) {
				System.out.print(pet + "\t");
			}
			System.out.println();
		}
	}
}

class Pet {
}

class Dog extends Pet {
	private String name;

	public Dog() {
	}

	public Dog(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
}

class Cat extends Pet {
	private String name;

	public Cat() {
	}

	public Cat(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}

}

class Pig extends Pet {
	private String name;

	public Pig() {
	}

	public Pig(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pig [name=" + name + "]";
	}
}
package com.asiainfo.chapter15;

import java.util.Iterator;

/**
 * 泛型接口
 *
 * @author zhiwangzhang
 * @date 2016年7月2日 下午6:14:15
 */
public class Test21 {
	public static void main(String[] args) {
		PetGenerator<Pet> pg = new PetGenerator<Pet>();
		for(int i = 1; i <= 3; i++) {
			System.out.println(pg.next());
		}
		System.out.println("----------------");
		for(Pet p : new PetGenerator<Pet>(3)) {
			System.out.println(p);
		}
	}
}

class Pet {
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}

class Dog extends Pet {}

class Cat extends Pet {}

class Pig extends Pet {}

interface Generator<T> {
	T next();
}

class PetGenerator<T> implements Generator<T>, Iterable<T>{
	private Class[] classes = new Class[]{Cat.class, Dog.class, Pig.class};
	private int size;
	
	public PetGenerator() {}
	
	public PetGenerator(int size) {
		this.size = size;
	}
	
	@Override
	public T next() {
		try {
			return (T) classes[(int)(Math.random() * 3)].newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			private int num = size;//num为末端哨兵
			@Override
			public boolean hasNext() {
				return num > 0;
			}
			
			@Override
			public T next() {
				num--;
				return PetGenerator.this.next();
			}
			
			@Override
			public void remove() {}
		};
	}
}
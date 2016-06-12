package com.asiainfo.chapter15.exercise;

/**
 * p354练习1
 *
 * @author zhiwangzhang
 * @date 2016年6月12日 下午9:28:00
 */
public class Exercise_1<T> {
	private T t;

	public Exercise_1() {
	}

	public Exercise_1(T t) {
		this.t = t;
	}

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public static void main(String[] args) {
		Exercise_1<Pet> e1 = new Exercise_1<Pet>();
		e1.set(new Pet());
		e1.set(new Cat());
		e1.set(new Dog());
		Pet p1 = e1.get();
//		Cat c1 = (Cat) e1.get();//java.lang.ClassCastException: com.asiainfo.chapter15.exercise.Dog cannot be cast to com.asiainfo.chapter15.exercise.Cat
		Dog d1 = (Dog) e1.get();

		Exercise_1<Dog> e2 = new Exercise_1<Dog>();
		// e2.set(new Pet());//The method set(Dog) in the type Exercise_1<Dog>
		// is not applicable for the arguments (Pet)
		// e2.set(new Cat());//The method set(Dog) in the type Exercise_1<Dog>
		// is not applicable for the arguments (Cat)
		e2.set(new Dog());
		e2.set(new Pug());
		Dog d2 = e2.get();
		Pug p2 = (Pug) e2.get();
		Pet p3 = e2.get();
		Individual i1 = e2.get();
//		Cat c2 = e2.get();//Type mismatch: cannot convert from Dog to Cat
	}
}

class Individual {
	public Individual() {
	}

	public Individual(String s) {
	}
}

class Person extends Individual {
	public Person() {
	}

	public Person(String s) {
		super(s);
	}
}

class Pet extends Individual {
	public Pet() {
	}

	public Pet(String s) {
		super(s);
	}
}

class Dog extends Pet {
	public Dog() {
	}

	public Dog(String s) {
		super(s);
	}
}

class Cat extends Pet {
	public Cat() {
	}

	public Cat(String s) {
		super(s);
	}
}

class Pug extends Dog {
	public Pug() {
	}

	public Pug(String s) {
		super(s);
	}
}
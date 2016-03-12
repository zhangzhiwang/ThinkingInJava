package com.asiainfo.chapter14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * p323-p327代码
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月12日 上午11:11:44
 */
public class Test18 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		PetCount.countPets(new FornameCreator());
	}
}

class Individual {
	public Individual() {
	}

	public Individual(String s) {
	}
}

class Person extends Individual {
	public Person(String name) {
		super(name);
	}
}

class Pet extends Individual {
	public Pet() {
	}

	public Pet(String name) {
		super(name);
	}
}

class Dog extends Pet {
	public Dog() {
	}

	public Dog(String name) {
		super(name);
	}
}

class Mutt extends Dog {
	public Mutt() {
	}

	public Mutt(String name) {
		super(name);
	}
}

class Pug extends Dog {
	public Pug() {
	}

	public Pug(String name) {
		super(name);
	}
}

class Cat extends Pet {
	public Cat() {
	}

	public Cat(String name) {
		super(name);
	}
}

class EgyptianMau extends Cat {
	public EgyptianMau() {
	}

	public EgyptianMau(String name) {
		super(name);
	}
}

class Manx extends Cat {
	public Manx() {
	}

	public Manx(String name) {
		super(name);
	}
}

class Cymric extends Manx {
	public Cymric() {
	}

	public Cymric(String name) {
		super(name);
	}
}

class Rodent extends Pet {
	public Rodent() {
	}

	public Rodent(String name) {
		super(name);
	}
}

class Rat extends Rodent {
	public Rat() {
	}

	public Rat(String name) {
		super(name);
	}
}

class Mouse extends Rodent {
	public Mouse() {
	}

	public Mouse(String name) {
		super(name);
	}
}

class Hamster extends Rodent {
	public Hamster() {
	}

	public Hamster(String name) {
		super(name);
	}
}

abstract class PetCreator {
	private Random r = new Random(47);

	public abstract List<Class<? extends Pet>> types();

	public Pet randomPet() throws InstantiationException, IllegalAccessException {
		int i = r.nextInt(types().size());
		return types().get(i).newInstance();
	}

	public Pet[] createArray(int length) throws InstantiationException, IllegalAccessException {
		Pet[] ps = new Pet[length];
		for (int i = 0; i < length; i++) {
			ps[i] = randomPet();
		}
		return ps;
	}
}

class FornameCreator extends PetCreator {
	private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
	private static String[] typeNames = { "com.asiainfo.chapter14.Mouse", "com.asiainfo.chapter14.Rat", "com.asiainfo.chapter14.Hamster", "com.asiainfo.chapter14.Pug", "com.asiainfo.chapter14.Mutt", "com.asiainfo.chapter14.Cymric", "com.asiainfo.chapter14.Manx", "com.asiainfo.chapter14.EgyptianMau", "com.asiainfo.chapter14.Gerbil" };// Gerbil是为Exercise_11准备的

	static {
		try {
			loader();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void loader() throws ClassNotFoundException {
		for (String name : typeNames) {
			types.add((Class<? extends Pet>) Class.forName(name));
		}
	}

	public List<Class<? extends Pet>> types() {
		return types;
	}
}

class PetCount {
	static class PetCounter extends HashMap<String, Integer> {
		public void count(String type) {
			Integer i = get(type);
			if (i == null) {
				put(type, 1);
			} else {
				put(type, i + 1);
			}
		}
	}

	public static void countPets(PetCreator creator) throws InstantiationException, IllegalAccessException {
		PetCounter counter = new PetCount.PetCounter();
		for (Pet pet : creator.createArray(20)) {
			System.out.print(pet.getClass().getSimpleName() + "\t");
			if (pet instanceof Pet) {
				counter.count("Pet");
			}
			if (pet instanceof Rodent) {
				counter.count("Rodent");
			}
			if (pet instanceof Dog) {
				counter.count("Dog");
			}
			if (pet instanceof Cat) {
				counter.count("Cat");
			}
			if (pet instanceof Mouse) {
				counter.count("Mouse");
			}
			if (pet instanceof Rat) {
				counter.count("Rat");
			}
			if (pet instanceof Hamster) {
				counter.count("Hamster");
			}
			if (pet instanceof Pug) {
				counter.count("Pug");
			}
			if (pet instanceof Mutt) {
				counter.count("Mutt");
			}
			if (pet instanceof Manx) {
				counter.count("Manx");
			}
			if (pet instanceof Cymric) {
				counter.count("Cymric");
			}
			if (pet instanceof EgyptianMau) {
				counter.count("EgyptianMau");// EgyptianMau
			}
			if (pet instanceof Gerbil) {// for Exercise_11
				counter.count("Gerbil");
			}
		}
		System.out.println();
		System.out.println(counter);
	}

}
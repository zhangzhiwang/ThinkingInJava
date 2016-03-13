package com.asiainfo.chapter14.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * p333练习15
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月13日 上午11:38:02
 */
public class Exercise_15 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		TypeCounter tc = new TypeCounter(Pet2.class);
		for (int i = 0; i <= 20; i++) {
			Pet2 p = Pets.pc.randomPet();
			System.out.print(p + "\t");
			tc.count(p.getClass());
		}
		System.out.println();
		System.out.println(tc);
	}
}

class Pet2{}

interface Factory2<T> {
	T create();
}

class Rodent extends Pet2 {}

class Dog extends Pet2 {}

class Cat extends Pet2 {}

class Mouse extends Rodent {
	class MouseF implements Factory2 {
		@Override
		public Mouse create() {
			return new Mouse();
		}
	}
}

class Rat extends Rodent {
	class RatF implements Factory2 {
		@Override
		public Rat create() {
			return new Rat();
		}
	}
}

class Hamster extends Rodent {
	class HamsterF implements Factory2 {
		@Override
		public Hamster create() {
			return new Hamster();
		}
	}
}

class Pug extends Dog {
	class PugF implements Factory2 {
		@Override
		public Pug create() {
			return new Pug();
		}
	}
}

class Mutt extends Dog {
	class MuttF implements Factory2 {
		@Override
		public Mutt create () {
			return new Mutt();
		}
	}
}

class Cymric extends Cat {
	class CymricF implements Factory2 {
		@Override
		public Cymric create() {
			return new Cymric();
		}
	}
}

class Manx extends Cat {
	class ManxF implements Factory2 {
		@Override
		public Manx create() {
			return new Manx();
		}
	}
}

class EgyptianMau extends Cat {
	class EgyptianMauF implements Factory2 {
		@Override
		public EgyptianMau create() {
			return new EgyptianMau();
		}
	}
}

abstract class PetCreator {
	private Random r = new Random(47);

	public abstract List<Class<? extends Pet2>> types();

	public Pet2 randomPet() throws InstantiationException, IllegalAccessException {
		int i = r.nextInt(types().size());
		return types().get(i).newInstance();
	}

	public Pet2[] createArray(int length) throws InstantiationException, IllegalAccessException {
		Pet2[] ps = new Pet2[length];
		for (int i = 0; i < length; i++) {
			ps[i] = randomPet();
		}
		return ps;
	}
}

class Pets {
	public static PetCreator pc = new PetCreator() {
		List<Factory2<? extends Pet2>> list = new ArrayList<Factory2<? extends Pet2>>();
		Random r = new Random(47);
		{
			list.add(new Mouse().new MouseF());
			list.add(new Rat().new RatF());
			list.add(new Hamster().new HamsterF());
			list.add(new Pug().new PugF());
			list.add(new Mutt().new MuttF());
			list.add(new Cymric().new CymricF());
			list.add(new Manx().new ManxF());
			list.add(new EgyptianMau().new EgyptianMauF());
		}
		
		@Override
		public List<Class<? extends Pet2>> types() {
			return null;
		}
		
		public Pet2 randomPet() {
			return list.get(r.nextInt(list.size())).create();
		}
		
		public Pet2[] createArr(int length) {
			Pet2[] ps = new Pet2[length];
			for (int i = 0; i < length; i++) {
				ps[i] = randomPet();
			}
			return ps;
		}
		
		public ArrayList<Pet2> createList(int length) {
			return (ArrayList<Pet2>) Arrays.asList(createArr(length));
		}
	};
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
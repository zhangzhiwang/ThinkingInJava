package com.asiainfo.chapter15.exercise;

import java.util.ArrayList;

/**
 * p372练习19——货船（cargo ship）、甲板（deck）、集装箱（container）
 *
 * @author zhiwangzhang
 * @date 2016年7月9日 下午2:26:57
 */
public class Exercise_19 {
	public static void main(String[] args) {
		System.out.println(new CargoShip(5, 5));
	}
}

class Container {
	private static int count;
	private int id = count++;
	public static Generator<Container> gen = new Generator<Container>() {
		@Override
		public Container next() {
			return new Container();
		}
	};

	@Override
	public String toString() {
		return "Container " + id;
	}
}

class Deck extends ArrayList<Container> {
	private static int count;
	public int id = count++;

	public Deck() {
	}

	public Deck(int num) {
		Exercise_18.fill(this, Container.gen, num);
	}
}

class CargoShip extends ArrayList<Deck> {
	public CargoShip() {
	}

	public CargoShip(int cNum, int dNum) {
		for (int i = 0; i < cNum; i++) {
			add(new Deck(dNum));
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Deck d : this) {
			for (Container c : d) {
				sb.append("Deck " + d.id + " ---> " + c);
				sb.append("\n");
			}
		}
		return sb.toString();
	}
}
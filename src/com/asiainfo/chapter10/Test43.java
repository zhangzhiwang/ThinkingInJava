package com.asiainfo.chapter10;

import java.util.ArrayList;
import java.util.List;

/**
 * 内部类实现接口
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月25日 下午5:23:48
 */
public class Test43 {
	public static void main(String[] args) {
		CarController con = new CarController();
		con.addCar(con.new Car1(11));
		con.addCar(con.new Car2(1));
		con.func1();
	}
}

abstract class FamousCar {
	int cost;

	public FamousCar(int cost) {
		this.cost = cost;
	}

	public boolean isExpensive() {
		return cost >= 10;
	}

	public abstract void run();
}

class Controller {
	private List<FamousCar> list = new ArrayList<FamousCar>();

	public void addCar(FamousCar car) {
		list.add(car);
	}

	public void func1() {
		for (FamousCar car : list) {
			if (car.isExpensive()) {
				System.out.println(car);
				car.run();
			}
		}
	}
}

class CarController extends Controller {
	class Car1 extends FamousCar {
		public Car1(int i) {
			super(i);
		}

		@Override
		public void run() {
			System.out.println("Car1 runs.");
		}

		@Override
		public String toString() {
			return "Car1";
		}
	}

	class Car2 extends FamousCar {
		public Car2(int i) {
			super(i);
		}

		@Override
		public void run() {
			System.out.println("Car2 runs.");
		}

		@Override
		public String toString() {
			return "Car2";
		}
	}
}
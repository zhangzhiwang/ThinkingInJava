package com.asiainfo.chapter10.exercise;

import com.asiainfo.chapter10.exercise.CarController.Car1;
import com.asiainfo.chapter10.exercise.CarController.Car2;
import com.asiainfo.chapter10.exercise.CarController.Car3;

/**
 * p212练习25
 * <p>
 * 在Test43基础上修改
 * </p>
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月25日 下午5:51:40
 */
public class Exercise_25 {
	public static void main(String[] args) {
		CarController1 con = new CarController1();
		con.addCar(con.new Car1(11));
		con.addCar(con.new Car2(1));
		con.addCar(con.new Car3(11));
		con.addCar(con.new Car4(11));
		con.func1();
	}
}

class CarController1 extends CarController {
	class Car4 extends FamousCar {
		public Car4(int i) {
			super(i);
		}

		@Override
		public void run() {
			System.out.println("Car4 runs.");
		}

		@Override
		public String toString() {
			return "Car4";
		}
	}
}
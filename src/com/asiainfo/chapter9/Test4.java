package com.asiainfo.chapter9;

/**
 * 类实现多个接口
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月18日 下午2:08:41
 */
public class Test4 {
	public static void main(String[] args) {
		Bird b = new Bird();
		System.out.println(b instanceof Animal);
		System.out.println(b instanceof Fly);
		System.out.println(b instanceof Sleep);
		System.out.println(b instanceof Fight);

		func1(b);
		func2(b);
		func3(b);
		func4(b);
	}

	public static void func1(Fly f) {
		f.fly();
	}

	public static void func2(Sleep s) {
		s.sleep();
	}

	public static void func3(Fight f) {
		f.fight();
	}

	public static void func4(Animal a) {
		a.sleep();
		a.fight();
	}
}

interface Fly {
	void fly();
}

interface Sleep {
	void sleep();
}

interface Fight {
	void fight();
}

class Animal {
	public void sleep() {
		System.out.println("Animal.sleep");
	}

	public void fight() {// 如果此处的fight()方法不符合方法重写的条件，那么必须在BIrd类里面实现Fight接口的fight()方法
		System.out.println("Animal.fight");
	}
}

class Bird extends Animal implements Fly, Sleep, Fight {
	@Override
	public void fly() {
		System.out.println("Bird.fly");
	}

	@Override
	public void fight() {// 如果不实现Fight接口的fight方法也可以，因为Bird继承了Animal，而Animal里面有一个同访问控制权限、同返回值类型、同方法签名的方法fight()，相当于Animal类实现了Fight接口的fight()，类似的还有sleep()
		System.out.println("Bird.fight");
	}
}
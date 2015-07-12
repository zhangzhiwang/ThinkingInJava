package com.asiainfo.chapter3;

import static com.asiainfo.chapter3.Print.*;

/**
 * p45练习5、练习6
 * 
 * @author zhangzhiwang 2015年7月10日
 */
public class Test8 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name = "spot";
		d1.says = "Ruff!";

		Dog d2 = new Dog();
		d2.name = "scruffy";
		d2.says = "Wurf!";

		Dog d3 = d1;
		print(d1 == d2);
		print(d1 == d3);
		print(d2 == d3);
		print("------------");
		print(d1.equals(d2));
		print(d1.equals(d3));
		print(d3.equals(d2));
	}
}

class Dog {
	String name;
	String says;
}
package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * List的remove()、indexOf()、contains()方法根据元素equals()的定义不同而不同
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月9日 下午12:47:35
 */
public class Test13 {
	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<Fruit>();
		Fruit f1 = new Fruit(1, "apple");
		Fruit f2 = new Fruit(2, "orange");
		list.add(f1);
		list.add(f2);
		System.out.println(list);
		Fruit f3 = new Fruit(2, "orange");// f3并没有加入到list中
		System.out.println(list.indexOf(f3));
		System.out.println(list.contains(f3));
		System.out.println("为什么会出现这种结果？因为f2.equals(f3) = " + f2.equals(f3));
		System.out.println("---");

		Fruit f4 = new Fruit(4, "orange");// f4也没有加入到list中
		System.out.println(f4);
		System.out.println(list.indexOf(f4));
		System.out.println(list.contains(f4));
		System.out.println("为什么会出现这种结果？因为f2.equals(f4) = " + f2.equals(f4));
		System.out.println("本测试会因Fruit类的equals()的定义不同而有不同的测试结果");
	}
}

class Fruit {
	private int id;
	private String name;

	public Fruit() {
	}

	public Fruit(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
}

package com.asiainfo.chapter11.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * p227练习10
 * 
 * @author zhangzhiwang
 * @date 2015年10月11日 下午3:56:47
 */
public class Exercise_10 {
	public static void main(String[] args) {
		Sequence s = new Sequence(2);
		System.out.println(s.add(new Cat()));
		System.out.println(s.add(new Mouse()));
		System.out.println(s.add(new Cat()));

		Iterator it = s.iterator();
		while (it.hasNext()) {
			Rodent o = (Rodent) s.next();
			o.eat();
		}
	}
}

class Rodent {
	public void eat() {
		System.out.println("Rodent.eat");
	}
}

class Cat extends Rodent {
	@Override
	public void eat() {
		System.out.println("Cat.eat");
	}
}

class Mouse extends Rodent {
	@Override
	public void eat() {
		System.out.println("Mouse.eat");
	}
}

class Sequence implements Iterator {
	private Object[] array;
	private int index;

	public Sequence(int length) {
		array = new Object[length];
	}

	public boolean add(Object o) {
		if (hasNext()) {// 防止下标越界
			array[index] = o;
			index++;
			return true;
		}
		return false;
	}

	public Iterator iterator() {
		index = 0;
		return this;
	}

	@Override
	public boolean hasNext() {
		return index < array.length;
	}

	@Override
	public Object next() {
		if (hasNext()) {
			return array[index++];
		}
		return new UnsupportedOperationException();
	}

	@Override
	public void remove() {
	}
}
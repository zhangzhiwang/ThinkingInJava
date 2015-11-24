package com.asiainfo.chapter11;

import java.util.HashSet;
import java.util.Set;

/**
 * Set判断元素是否重复与元素的equals()方法有关
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月24日 下午12:22:52
 */
public class Test40 {
	public static void main(String[] args) {
		Set<Apple> set1 = new HashSet<Apple>();
		Apple a1 = new Apple(1, "apple1");
		Apple a2 = new Apple(2, "apple1");
		set1.add(a1);
		set1.add(a2);
		System.out.println(set1.toString());
	}
}

class Apple {
	private int id;
	private String name;

	public Apple() {
	}

	public Apple(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
		Apple other = (Apple) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", name=" + name + "]";
	}
	
	
}
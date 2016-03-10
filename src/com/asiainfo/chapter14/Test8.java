package com.asiainfo.chapter14;

import java.util.ArrayList;
import java.util.List;

/**
 * Class引用使用泛型
 * 
 * @author zhangzw8
 * @date 2016年3月10日 上午9:39:13
 */
public class Test8<T> {
	private Class<T> clazz;
	
	public Test8(Class<T> clazz) {
		this.clazz = clazz;
	}
	
	public Test8() {}
	
	public List<T> met1(int num) throws InstantiationException, IllegalAccessException {
		List<T> list = new ArrayList<T>();
		for (int i = 1; i <= num; i++) {
			list.add(clazz.newInstance());//调用默认（无参）构造器
		}
		return list;
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Test8<L> t = new Test8<L>(L.class);
		System.out.println(t.met1(15));
	}
}

class L {
	private static int i = 1;

	@Override
	public String toString() {
		return "L [i=" + (i++) + "]";
	}
	
}
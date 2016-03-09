package com.asiainfo.chapter14.exercise;

/**
 * p318练习8
 * 
 * @author zhangzw8
 * @date 2016年3月9日 下午1:01:35
 */
public class Exercise_8 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		met1(new I12());
	}

	public static void met1(Object o) throws InstantiationException, IllegalAccessException {
		Class c = o.getClass().getSuperclass();
		if (c == null) {
			return;
		}
		System.out.println(c.getSimpleName());
		met1(c.newInstance());
	}
}

class I12 extends I1 {
}
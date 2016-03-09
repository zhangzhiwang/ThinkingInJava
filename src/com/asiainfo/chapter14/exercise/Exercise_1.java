package com.asiainfo.chapter14.exercise;

/**
 * p318练习1
 * 
 * @author zhangzw8
 * @date 2016年3月9日 上午9:05:42
 */
public class Exercise_1 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class c1 = Class.forName("com.asiainfo.chapter14.exercise.Exercise_1");
		Object object = c1.newInstance();//java.lang.InstantiationException: com.asiainfo.chapter14.exercise.Exercise_1
		Exercise_1 e = (Exercise_1) object;
		e.met1();
	}
	
//	public Exercise_1() {}

	public Exercise_1(int i) {
	}

	public void met1() {
		System.out.println("hello");
	}
}

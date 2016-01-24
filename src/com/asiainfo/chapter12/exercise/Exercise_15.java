package com.asiainfo.chapter12.exercise;

/**
 * p267练习15
 * 
 * @author zhangzw8
 * @date 2016年1月23日 下午4:13:57
 */
public class Exercise_15 {
	private boolean state;

	public void func1() throws F {
		String s = null;
		s.length();
	}

	public static void main(String[] args) {
		Exercise_15 e = new Exercise_15();
		try {
			e.state = true;
			e.func1();
		} catch (F f) {
			f.printStackTrace();
		} finally {
			e.state = false;
			System.out.println(e.state);
		}

	}
}

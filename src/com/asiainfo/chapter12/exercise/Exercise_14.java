package com.asiainfo.chapter12.exercise;

/**
 * p267练习14（模拟场景：在程序退出之前灯必须关闭，true代表打开，false代表关闭）
 * 
 * @author zhangzw8
 * @date 2016年1月23日 下午3:46:52
 */
public class Exercise_14 {
	private boolean state;

	public void func1() throws F {
		String s = null;
		s.length();
	}

	public static void main(String[] args) {
		Exercise_14 e = new Exercise_14();
		try {
			e.state = true;
			e.func1();
			e.state = false;
		} catch (F f) {
			f.printStackTrace();
			e.state = false;
		}

		System.out.println(e.state);// 改行代码不会被执行
	}
}

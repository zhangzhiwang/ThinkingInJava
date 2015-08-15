package com.asiainfo.chapter8.exercise;

/**
 * p165练习16
 * 
 * @author zhangzhiwang
 * @date 2015年8月15日 下午4:41:18
 */
public class Exercise_16 {
	private AlertStatus a = new AlertStatus();

	public void change(AlertStatus y) {
		a = y;
	}

	public void play() {
		a.func1();
	}

	public static void main(String[] args) {
		Exercise_16 e = new Exercise_16();
		e.play();
		e.change(new Yellow());
		e.play();
		e.change(new Red());
		e.play();
		e.change(new Green());
		e.play();
	}
}

class AlertStatus {
	public void func1() {
		System.out.println("AlertStatus");
	}
}

class Yellow extends AlertStatus {
	@Override
	public void func1() {
		System.out.println("Yellow");
	}
}

class Red extends AlertStatus {
	@Override
	public void func1() {
		System.out.println("Red");
	}
}

class Green extends AlertStatus {
	@Override
	public void func1() {
		System.out.println("Green");
	}
}
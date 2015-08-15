package com.asiainfo.chapter8;

/**
 * 组合较之于继承更加灵活
 * 
 * @author zhangzhiwang
 * @date 2015年8月15日 下午4:27:12
 */
public class Test8 {
	public void func1() {
		System.out.println("Test8");
	}
}

class L extends Test8 {
	@Override
	public void func1() {
		System.out.println("L");
	}
}

class M extends Test8 {
	@Override
	public void func1() {
		System.out.println("M");
	}
}

class N {
	private Test8 t = new L();

	public void change() {
		t = new M();
	}

	public void play() {
		t.func1();
	}

	public static void main(String[] args) {
		N n = new N();
		n.play();
		n.change();
		n.play();
	}
}
package com.asiainfo.chapter15;

/**
 * 泛型方法
 *
 * @author zhiwangzhang
 * @date 2016年7月3日 上午10:19:51
 */
public class Test25 {
	public <A> void m(A a) {
		System.out.println(a.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		Test25 t = new Test25();
		t.m(1);
		t.m(1.1);
		t.m(true);
		t.m('a');
		t.m("");
		t.m(t);
	}
}

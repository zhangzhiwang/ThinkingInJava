package com.asiainfo.chapter15;

/**
 * ��final���ε��಻�ܼ̳У����й��캯����Ϊprivate���಻�ܼ̳�
 *
 * @author zhiwangzhang
 * @date 2016��6��12�� ����8:33:53
 */
public final class Test1 {

}

//class Test1_1 extends Test1 {}

class A {
	private A() {}
	
	public A(int i) {}
}

class A1 extends A{
	public A1() {
		super(1);
	}
}
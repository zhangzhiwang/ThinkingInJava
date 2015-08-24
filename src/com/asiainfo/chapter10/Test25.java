package com.asiainfo.chapter10;

public class Test25 {
	public void getL() {
		new L() {
			
			{
				System.out.println("inner");
			}
			
			public void func2() {
				System.out.println("Test25.getL().L.func2()");
			}
		}.func2();// 相当于new了一个L子类的对象，用该对象调用子类的方法func2。完整形式见Test27
	}
	
	public static void main(String[] args) {
		Test25 t = new Test25();
		t.getL();
	}
}

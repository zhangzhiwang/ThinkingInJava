package com.asiainfo.chapter10;

/**
 * 内部类
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月19日 上午10:40:21
 */
public class Test1 {
	private A a1 = new A();// 外部类的属性可以直接实例化内部类的对象
	private B b = new B();
	
	public class A {
		private int i;
		
		public int func1() {
			return i;
		}
	}
	
	public class B {
		private String s;
		
		public B(String s) {
			this.s = s;
		}
		
		public B() {}
		
		public String getName() {
			return s;
		}
	}
	
	public void func2(String name) {
		A a = new A();// 外部类的非静态方法里面可以直接实例化内部类对象
		B b = new B(name);
		System.out.println(b.getName());
		
		A a3 = getA();
		B b3 = getB();
	}
	
	public A getA() {
		return new A();
	}
	
	public B getB() {
		return new B();
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.func2("hello");
		System.out.println(t.a1);
//		A a2 = new A();// No enclosing instance of type Test1 is accessible. Must qualify the allocation with an enclosing instance of type Test1 (e.g. x.new A() where x is an instance of Test1).
		Test1.A a2 = t.new A();
		
		A a4 = t.getA();// TODO 测试结果与p191练习1上面一段描述不符
		B b4 = t.getB();
	}
}
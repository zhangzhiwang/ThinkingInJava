package com.asiainfo.chapter10;

/**
 * 匿名内部类的构造器就是实例初始化
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 上午10:05:41
 */
public class Test23 {
	public L getL(final int i) {
		return new L() {
			private int i;
			
			{
				System.out.println("This is the inner class constructor.");
				this.i = i;
			}
			
			@Override
			public void func1() {
				System.out.println("Test23.func1()");
			}
		};
	}
	
	public static void main(String[] args) {
		Test23 t = new Test23();
		t.getL(1).func1();
	}
}

class L {
	public L() {
		System.out.println("L");
	}
	
	public void func1() {
		System.out.println("L.func1()");
	}
}
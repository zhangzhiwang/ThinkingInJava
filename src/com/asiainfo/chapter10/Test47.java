package com.asiainfo.chapter10;

/**
 * 子类继承父类，父类的内部类没有默认地被子类继承（除非显示地继承），所以父类的内部类也不能默认地被覆盖
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月27日 上午9:17:26
 */
public class Test47 extends HH {
	class HH1 {// 由于父类的内部类没有默认地被子类继承，所以也不会存在覆盖的概念
		public HH1() {
			System.out.println("Test47.HH1");
		}
	}
	
	public static void main(String[] args) {
		new Test47();
	}
}

class HH {
	private HH1 hh1;
	
	class HH1 {
		public HH1() {
			System.out.println("HH.HH1");
		}
	}
	
	public HH() {
		System.out.println("HH");
		hh1 = new HH1();
	}
}
package com.asiainfo.chapter10;

/**
 * 匿名内部类只能使用一次，固匿名内部类只能实例化一次
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月28日 上午9:03:30
 */
public class Test50 {
	public KK getKK() {
		return new KK() {
			{
				System.out.println("Test50.getKK().KK");
			}
		};
	}
	
	public static void main(String[] args) {
		Test50 t = new Test50();
		for (int i = 0; i < 10; i++) {
			t.getKK();// 不是在一个匿名内部类里面创建了10个对象，而是在10个不同的内部类里面创建了10个对象（每个匿名内部类创建一个）
		}
	}
}

interface KK {
	
}
package com.asiainfo.chapter14;

/**
 * 省略子类对象调用父类方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月12日 上午10:36:36
 */
public class Test17 extends O {
	public void met2() {
		met1();//子类省略对象this而直接调用父类的方法
	}
}

class O {
	public void met1() {
		System.out.println("O");
	}
}
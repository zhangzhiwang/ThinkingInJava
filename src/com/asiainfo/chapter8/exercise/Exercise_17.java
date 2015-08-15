package com.asiainfo.chapter8.exercise;

/**
 * p168练习17
 * 
 * @author zhangzhiwang
 * @date 2015年8月15日 下午5:18:03
 */
public class Exercise_17 {
	public static void main(String[] args) {
		Cycle3[] cs = { new Unicycle3(), new Bicycle3(), new Tricycle3() };
//		cs[0].balance();// The method balance() is undefined for the type Cycle3
//		cs[1].balance();
//		cs[1].balance();
		((Unicycle3)cs[0]).balance();
		((Bicycle3)cs[0]).balance();
//		((Tricycle3)cs[0]).balance();// The method balance() is undefined for the type Tricycle3
	}
}

class Cycle3 {
	
}

class Unicycle3 extends Cycle3 {
	public void balance() {}
}

class Bicycle3 extends Cycle3 {
	public void balance() {}
}

class Tricycle3 extends Cycle3 {
	
}
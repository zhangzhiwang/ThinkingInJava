package com.asiainfo.chapter12.exercise;

/**
 * p281练习29
 * 
 * @author zhangzw8
 * @date 2016年2月22日 下午1:19:39
 */
public class Exercise_29 extends Inning implements Storm {
	public Exercise_29() {}
	
	public Exercise_29(String s) {}
	
	public void walk() {}
	
	public void event() {}
	
	public void rainHard() {}
	
	public void atBat() {}
	
	public static void main(String[] args) {
		Exercise_29 e = new Exercise_29();
		e.atBat();
		
		Inning i = new Exercise_29();
		i.atBat();
	}
}

class M extends RuntimeException {}

class M1 extends M {}

class M2 extends M {}

abstract class Inning {
	public Inning() throws M {}
	
	public void event() throws M {}
	
	public abstract void atBat() throws M1, M2;
	
	public void walk() {};
}

class N extends RuntimeException {}

class N1 extends N {}

class M11 extends M1 {}

interface Storm {
	public void event() throws N1;
	
	public void rainHard() throws N1;
}
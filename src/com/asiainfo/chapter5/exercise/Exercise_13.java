package com.asiainfo.chapter5.exercise;

/**
 * p97Á·Ï°13
 * 
 * @author zhangzw8@asiainfo.com\n 2015Äê8ÔÂ5ÈÕ
 */
public class Exercise_13 {
//	private static Tables t1 = new Tables(1);
//	private static Tables t2 = new Tables(2);

	public static void main(String[] args) {
//		 new Tables(1);
		 Tables.num++;
//		 System.out.println(Tables.num);
	}
}

class Cups {
	public Cups(int i) {
		System.out.println("Cups " + i);
	}
}

class Tables {
	public static Cups c1;
	public static Cups c2;
	public Cups c3 = new Cups(3);
	 public static int num;

	static {
		c1 = new Cups(1);
		c2 = new Cups(2);
		 num = 1;
	}

	public Tables(int i) {
		System.out.println("Tables " + i);
		System.out.println("---------------");
	}
}
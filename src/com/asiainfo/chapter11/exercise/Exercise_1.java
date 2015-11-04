package com.asiainfo.chapter11.exercise;

import java.util.ArrayList;

/**
 * p218练习1
 * 
 * @author zhangzhiwang
 * @date 2015年10月3日 下午2:55:59
 */
public class Exercise_1 {
	public static void main(String[] args) {
		ArrayList<Gerbil> list = new ArrayList<Gerbil>();
		list.add(new Gerbil(1));
		list.add(new Gerbil(2));

		for (int i = 0; i < list.size(); i++) {
			list.get(i).hop();
		}
	}
}

class Gerbil {
	private int gerbilNumber;

	public Gerbil(int num) {
		gerbilNumber = num;
	}

	public Gerbil() {
	}

	public void hop() {
		System.out.println(gerbilNumber);
	}

	@Override
	public String toString() {
		return "Gerbil [gerbilNumber=" + gerbilNumber + "]";
	}

}
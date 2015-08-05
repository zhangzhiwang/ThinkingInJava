package com.asiainfo.chapter5.exercise;

/**
 * p107练习21、22
 * 
 * @author zhangzhiwang 2015年8月5日
 */
public enum Exercise_21_22 {
	RED, BLUE;
	public static void main(String[] args) {
		for (Exercise_21_22 e : Exercise_21_22.values()) {
			System.out.println(e + "-->" + e.ordinal());
			switch (e) {
			case RED:
				System.out.println("red");
				break;
			case BLUE:
				System.out.println("blue");
				break;
			default:
				System.out.println("none");
			}
		}
	}
}

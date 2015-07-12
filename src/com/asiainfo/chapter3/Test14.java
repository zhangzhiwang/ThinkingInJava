package com.asiainfo.chapter3;

import static com.asiainfo.chapter3.Print.*;

import java.util.Random;

/**
 * p46练习7
 * 
 * @author zhangzhiwang 2015年7月11日
 */
public class Test14 {
	public static void main(String[] args) {
		Random r = new Random();
		int coin = r.nextInt(2);
		if (coin == 0) {
			print("up");
		} else {
			print("down");
		}
	}
}

/**
 * 
 */
package com.asiainfo.chapter4.exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 练习10
 * 
 * @author zhangzhiwang 2015年7月14日
 */
public class Exercise_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		for (int i = 10; i <= 99; i++) {
			for (int j = 10; j <= 99; j++) {
				if ((i * j) % 100 == 0) {
					continue;
				}
				String num = String.valueOf(i * j);
				String[] val = num.split("");
				Arrays.sort(val);
				String[] str = (i + String.valueOf(j)).split("");
				Arrays.sort(str);
				if (Arrays.equals(val, str)) {
					set.add(num);
				}
			}
		}

		System.out.println(set.size());
		for (String s : set) {
			System.out.println(s);
		}
	}

}

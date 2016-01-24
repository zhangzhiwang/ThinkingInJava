package com.asiainfo.chapter12;

/**
 * 当遇到break/continue/return的时候，finally也会执行
 * 
 * @author zhangzw8
 * @date 2016年1月23日 下午3:25:16
 */
public class Test29 {
	public static void main(String[] args) {
		while (true) {
			try {
				System.out.println(1);
				break;
			} finally {
				System.out.println("hello");
			}
		}

		System.out.println("-------------------------");
		for (int i = 0; i < 6; i++) {
			try {
				if (i == 2) {
					continue;
				}
				System.out.println(i);
			} finally {
				System.out.println("world" + i);
			}
		}

		System.out.println("------------");
		for (int i = 0; i < 6; i++) {
			try {
				if (i == 2) {
					return;
				}
				System.out.println(i);
			} finally {
				System.out.println("world" + i);
			}
		}
	}
}

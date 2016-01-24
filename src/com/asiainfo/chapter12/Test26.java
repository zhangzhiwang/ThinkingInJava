package com.asiainfo.chapter12;

/**
 * finally——无论异常是否抛出该块代码都会被执行
 * 
 * @author zhangzw8
 * @date 2016年1月23日 上午10:57:53
 */
public class Test26 {
	private static int count;

	public static void main(String[] args) {
		while (true) {
			try {
				if (count++ == 0) {
					System.out.println(1);
					throw new F();
				}
				System.out.println(2);
			} catch (F f) {
				System.out.println(3);
			} finally {
				System.out.println(4);
				if (count == 2) {
					break;
				}
			}
		}
	}
}

package com.asiainfo.chapter12.exercise;

/**
 * p269练习18
 * 
 * @author zhangzw8
 * @date 2016年1月24日 上午11:01:24
 */
public class Exercise_18 {
	public static void main(String[] args) {
		try {
			try {
				try {
					throw new D();
				} catch (Exception e) {
					// 实际场景中，这种吃掉异常的方式是最常见的
				} finally {
					throw new E();
				}

			} catch (Exception e) {
				// 吃掉异常就是脑残
			} finally {
				throw new C();
			}
		} catch (C e) {
			e.printStackTrace();
		}
	}
}

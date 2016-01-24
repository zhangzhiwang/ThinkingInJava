package com.asiainfo.chapter12.exercise;

/**
 * p269练习19
 * 
 * @author zhangzw8
 * @date 2016年1月24日 上午11:10:42
 */
public class Exercise_19 {
	public static void main(String[] args) {
		try {
			try {
				try {
					throw new D();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					throw new E();
				}

			} catch (E e) {
				e.printStackTrace();
			} finally {
				throw new C();
			}
		} catch (C e) {
			e.printStackTrace();
		}
	}
}

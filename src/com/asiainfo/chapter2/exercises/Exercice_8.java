/**
 * 
 */
package com.asiainfo.chapter2.exercises;

/**
 * ��ϰ8
 * 
 * @author zhangzhiwang
 * @date 2015��4��6��
 */
public class Exercice_8 {
	int num;
	static int age = 10;

	public static void main(String[] args) {
		Exercice_8 e1 = new Exercice_8();
		Exercice_8 e2 = new Exercice_8();
		e1.num = 1;
		System.out.println(e1.num);
		System.out.println(e2.num);
		System.out.println(e1.age);
		System.out.println(e2.age);
		System.out.println(Exercice_8.age);
	}
}

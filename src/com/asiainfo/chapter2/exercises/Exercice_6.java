/**
 * 
 */
package com.asiainfo.chapter2.exercises;

/**
 * ��ϰ6
 * 
 * @author zhangzhiwang
 * @date 2015��4��6��
 */
public class Exercice_6 {
	public static void main(String[] args) {
		Exercice_6 exercice_6 = new Exercice_6();
		System.out.println(exercice_6.storage("abc"));
	}

	int storage(String s) {
		return s.length() * 2;
	}
}

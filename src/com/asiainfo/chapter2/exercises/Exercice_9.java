/**
 * 
 */
package com.asiainfo.chapter2.exercises;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 
 * @author zhangzhiwang
 * @date 2015��4��6��
 */
public class Exercice_9 {
	static Byte b1 = new Byte("1");
	static Short s1 = new Short((short) 1);
	static Character c1 = new Character('a');
	static Integer i1 = new Integer(1);
	static Long l1 = new Long(1);
	static Float f1 = new Float(1);
	static Double d1 = new Double(1.0);
	static Boolean bo1 = new Boolean(true);
	static BigInteger bigInteger = new BigInteger("123");
	static BigDecimal bigDecimal = new BigDecimal(321);

	public static void main(String[] args) {
		byte b2 = b1;
		short s2 = s1;
		char c2 = c1;
		int i2 = i1;
		long l2 = l1;
		float f2 = f1;
		double d2 = d1;
		boolean bo2 = bo1;

		System.out.println(b2);
		System.out.println(s2);
		System.out.println(c2);
		System.out.println(i2);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(bo2);
		System.out.println(bigInteger);
		System.out.println(bigDecimal);
	}
}

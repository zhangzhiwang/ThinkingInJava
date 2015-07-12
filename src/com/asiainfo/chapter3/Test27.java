package com.asiainfo.chapter3;

/**
 * 对于byte、short、char类型，算术运算会将计算结果提升为int
 * @author zhangzhiwang
 * 2015年7月12日
 */
public class Test27 {
	public static void main(String[] args) {
		byte b = 1;
//		byte c = b + b;
		byte c = (byte) (b + b);
		b += b;// 复合赋值不需要类型转换
		
		
		short s1 = 1;
		short s2 = 2;
//		short s3 = s2 + s1;
		short s3 = (short) (s2 + s1);
		s1 += s1;
	}
}

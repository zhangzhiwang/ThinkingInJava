package com.asiainfo.chapter5;

/**
 * 可变参数列表相当于数组
 * 
 * @author zhangzhiwang 2015年8月5日
 */
public class Test23 {
	public static void main(String[] args) {
		func(new Object[] { 1, 2, 3 });
		func(new Object[] { new Test23(), new Test23() });// 默认情况下，打印对象本身的结果是对象所属的类名@对象的地址
		func(new Object[] { "aaa", 'b', new Double(1) });
	}

	public static void func(Object[] args) {
		for (Object o : args) {
			System.out.print(o + "\t");
		}
		System.out.println();
	}
}

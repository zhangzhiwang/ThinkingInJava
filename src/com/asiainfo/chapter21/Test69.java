package com.asiainfo.chapter21;

/**
 * 创建线程本地变量——ThreadLocal
 * 
 * @author zhangzw8
 * @date 2016年4月4日 上午11:14:09
 */
public class Test69 {
	private static Integer i = new Integer(0);

	public static void main(String[] args) {
		ThreadLocal<Integer> t1 = new ThreadLocal<Integer>();
		ThreadLocal<Integer> t2 = new ThreadLocal<Integer>(){
			@Override
			protected Integer initialValue() {
				return i;
			} 
		};
		t1.set(i);
//		t2.set(i);
		for (int i = 1; i <= 1000; i++) {
			t1.set(t1.get() + 1);
		}
		
		for (int i = 1; i <= 500; i++) {
			t2.set(t2.get() + 1);
		}
		
		System.out.println("t1.get() = " + t1.get());
		System.out.println("t2.get() = " + t2.get());
		System.out.println("i = " + i);
	}
}

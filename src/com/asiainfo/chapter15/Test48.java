package com.asiainfo.chapter15;

/**
 * 有关向下转型和擦除
 * 
 * @author zhangzw8
 * @date 2016年7月12日 上午9:16:46
 */
public class Test48<T> implements Test48_1 {
	public Test48_1 m1(Object o) {
		return (Test48_1) o;
	}
	
	public T m2(Object o) {
		return (T) o;//Type safety: Unchecked cast from Object to T  m1()和m2()同样是向下转型，为什么m2()有警告？泛型被擦除了吗？
	}
	
	public static void main(String[] args) {
		new Test48().m1(new Test46());
	}
}

interface Test48_1 {}
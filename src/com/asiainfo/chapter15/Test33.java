package com.asiainfo.chapter15;

/**
 * 通用的Generator
 *
 * @author zhiwangzhang
 * @date 2016年7月3日 下午4:02:26
 */
public class Test33 {
	public void m1() {
		System.out.println("m1");
	}

	public static void main(String[] args) {
		Test33 t = BasicGenerator.create(Test33.class).next();
		t.m1();
	}
}

class BasicGenerator<T> implements Generator<T> {
	private Class<T> cla;

	private BasicGenerator() {
	}

	public BasicGenerator(Class<T> cla) {
		this.cla = cla;
	}

	@Override
	public T next() {
		try {
			return (T) cla.newInstance();
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	public static <T> Generator<T> create(Class<T> cla) {
		return new BasicGenerator<T>(cla);
	}
}

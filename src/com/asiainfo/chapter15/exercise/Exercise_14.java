package com.asiainfo.chapter15.exercise;

/**
 * p365练习14
 * 
 * @author zhangzw8
 * @date 2016年7月4日 上午9:49:06
 */
public class Exercise_14 {
	public static void main(String[] args) {
		Generator<Integer> bg = new BasicGenerator<Integer>(Integer.class);
		Generator<Integer> bg2 =BasicGenerator.create(Integer.class);
		Integer i = bg.next();
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
			return cla.newInstance();
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
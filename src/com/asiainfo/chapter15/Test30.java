package com.asiainfo.chapter15;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 利用生成器填充Collection
 *
 * @author zhiwangzhang
 * @date 2016年7月3日 下午2:02:24
 */
public class Test30 {
	public static <T> Collection<T> fill(Collection<T> col, Generator3<T> gen, int size) {
		for (int i = 0; i < size; i++) {
			col.add(gen.next());
		}
		return col;
	}

	public static void main(String[] args) {
		Collection<Integer> c1 = fill(new ArrayList<Integer>(), new Test30Generator(), 10);
		System.out.println(c1);
	}
}

interface Generator3<T> {
	T next();
}

class Test30Generator implements Generator3<Integer> {
	@Override
	public Integer next() {
		return (int) (Math.random() * 10);
	}
}
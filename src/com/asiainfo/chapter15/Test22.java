package com.asiainfo.chapter15;

/**
 * 斐波那且数列——递归
 *
 * @author zhiwangzhang
 * @date 2016年7月2日 下午6:36:56
 */
public class Test22 {
	public static void main(String[] args) {
		Fib f = new Fib();
		while (true) {
			int i = f.next();
			System.out.print(i + "\t");
			if (i > 2000) {
				break;
			}
		}
	}
}

interface Generator2<T> {
	T next();
}

class Fib implements Generator2<Integer> {
	private int num = 1;

	@Override
	public Integer next() {
		return fib(num++);
	}

	public int fib(int i) {
		if (i <= 2) {
			return 1;
		}
		return fib(i - 2) + fib(i - 1);
	}
}
package com.asiainfo.chapter15;

import java.util.Iterator;

/**
 * 实现Iterable接口的类就可以直接在增强for循环中使用
 *
 * @author zhiwangzhang
 * @date 2016年7月2日 下午6:09:23
 */
public class Test20 implements Iterable<Integer>{

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void remove() {
			}
			
		};
	}
	
	public static void main(String[] args) {
		for (Integer i : new Test20()) {}
	}
}

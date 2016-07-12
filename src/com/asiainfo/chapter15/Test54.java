package com.asiainfo.chapter15;

/**
 * 泛型实例化方法三——通过Generator
 *
 * @author zhiwangzhang
 * @date 2016年7月12日 下午10:29:20
 */
public class Test54<T> implements Generator4<T>{
	private T t;
	
	public Test54() {}
	
	public Test54(Generator4<T> gen) {
		t = gen.next();
	}
	
	@Override
	public T next() {
		return null;
	}
	
	public static void main(String[] args) {
		Test54 test = new Test54<Integer>(new Generator4<Integer>(){
			@Override
			public Integer next() {
				return 1;
			}
		});
		System.out.println(test.t.getClass().getSimpleName());
	}
	
}

interface Generator4<T> {
	T next();
}



package com.asiainfo.chapter14;

/**
 * Class<? super M1>——表示某个类是M1的基类
 * 
 * @author zhangzw8
 * @date 2016年3月10日 下午1:49:08
 */
public class Test10 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class<M1> c1 = M1.class;
		M1 m1 = c1.newInstance();
		Class<? super M1> c2 = c1.getSuperclass();
		M m = (M) c2.newInstance();//返回值不是M，而是Object
		
//		Class<M> c3 = c1.getSuperclass();//Type mismatch: cannot convert from Class<capture#3-of ? super M1> to Class<M>
	}
}

class M {}

class M1 extends M {}
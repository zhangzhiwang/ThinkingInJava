package com.asiainfo.chapter14;

/**
 * 关于newInstance()方法
 * 
 * @author zhangzw8
 * @date 2016年3月10日 上午9:54:31
 */
public class Test9 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class c1 = L.class;
		Object o = c1.newInstance();//默认情况下newInstance()方法返回Object类型的引用，但是如果使用了泛型，则返回具体泛型类引用
		
		Class<L> c2 = L.class;
		L l = c2.newInstance();//返回具体泛型类引用
		
		Class<? extends L> c3 = L.class;
		L l2 = c3.newInstance();
	}
}

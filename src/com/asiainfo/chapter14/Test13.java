package com.asiainfo.chapter14;

/**
 * Class的newInstance()方法
 * 
 * @author zhangzw8
 * @date 2016年3月11日 上午9:31:37
 */
public class Test13 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class<? extends L> c = L1.class;
		L l1 = c.newInstance();
		c = Test12.class;
//		L l2 = c.newInstance();
		Test12 t = (Test12) c.newInstance();//由于Class有泛型（任何从L继承的子类的Class），所以c.newInstance()方法返回L类型的对象而非Object对象，所以这里的转型是从L向下转型到Test12，如果Class定义的时候没有泛型，则会从Object向下转型到Test12
		
		Class c1 = L.class;
		Test12 t1 = (Test12) c1.newInstance();//Object->Test12
	}
}

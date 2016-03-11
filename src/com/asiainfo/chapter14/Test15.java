package com.asiainfo.chapter14;

/**
 * 某类的构造器是private的，通过反射来创建实例会抛出异常——IllegalAccessException
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月11日 下午9:29:09
 */
public class Test15 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class c = N.class;
		c.newInstance();//java.lang.IllegalAccessException: Class com.asiainfo.chapter14.Test15 can not access a member of class com.asiainfo.chapter14.N with modifiers "private"
	}
}

class N {
	private N() {}
}
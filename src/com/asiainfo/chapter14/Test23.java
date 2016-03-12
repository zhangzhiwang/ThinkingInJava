package com.asiainfo.chapter14;

/**
 * Class的isAssignableFrom()方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月12日 下午2:19:49
 */
public class Test23 extends L {
	public static void main(String[] args) {
		Class c = L.class;
		System.out.println(c.isAssignableFrom(L.class));//判定此 Class 对象所表示的类或接口与指定的 Class 参数所表示的类或接口是否相同，或是否是其超类或超接口。如果是则返回 true；否则返回 false。如果该 Class 表示一个基本类型，且指定的 Class 参数正是该 Class 对象，则该方法返回 true；否则返回 false。 
		System.out.println(c.isAssignableFrom(Test23.class));//clazz1.isAssignableFrom(clazz2)
	}
}

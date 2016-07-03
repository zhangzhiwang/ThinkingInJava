package com.asiainfo.chapter15;

/**
 * 静态方法不能直接访问泛型类的类型参数
 *
 * @author zhiwangzhang
 * @date 2016年7月3日 上午9:40:39
 */
public class Test24<T> {
	public void met1(T t) {}
	
//	public static void met2(T t) {}//Cannot make a static reference to the non-static type T
	
	public static <T> void met3(T t) {}//静态方法如果想具有泛型能力，就必须使其成为泛型方法
	
	public static <X> void met4(X x) {}
	
//	public void met5(U u) {}//U cannot be resolved to a type  非泛型方法中使用泛型，该类型参数必须是泛型类的类型参数，这里为T，比如met1()
	
	public <U> void met6(U u) {}//泛型方法中的泛型参数与泛型类的泛型参数无关，即可以使用泛型类的泛型参数（这里是T），也可以自定义泛型参数（这里是U），在met6()中使用的是自定义的泛型参数
	
	public <Y> void met7(T t) {}// 泛型方法自定义了一个泛型参数Y，但同时使用了泛型类的泛型参数
}

class Test24_1 {
//	public void met8(T t) {}//T cannot be resolved to a type
	
	public <T> void met9(T t) {}//泛型方法与其所在的泛型类是否为泛型类无关
	
	public static <Z> void met10(Z z) {}
}


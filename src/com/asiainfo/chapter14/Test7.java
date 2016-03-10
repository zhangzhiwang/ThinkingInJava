package com.asiainfo.chapter14;

/**
 * 泛化的Class引用
 * 
 * @author zhangzw8
 * @date 2016年3月10日 上午9:01:13
 */
public class Test7 extends K {
	public static void main(String[] args) {
		Class c1 = int.class;
		c1 = double.class;
		c1 = Test7.class;
		c1 = String[].class;
		
		Class<Integer> c2 = int.class;
//		c2 = double.class;//Type mismatch: cannot convert from Class<Double> to Class<Integer>
		c2 = Integer.class;
		
		Class<K> c3 = K.class;
//		c3 = Test7.class;//Type mismatch: cannot convert from Class<Test7> to Class<K>    注意：Test7是K的子类，但Test7.class可不是K.class的子类，所以此行编译不通过。要想达到类似的效果，可以使用通配符?后面接extends关键字。这个和容器的泛型不一样，比如List<K>
		Class<? extends K> c4 = K.class;
		c4 = Test7.class;
		c4 = Test7_1.class;
//		c4 = Test6.class;//使用泛化的Class引用的好处是，可以在编译期进行类型检查，如果不使用泛型那么类型错误会在运行时才能被发现，还是那个原则——越早发现问题对问题的解决越有利
	}
}

class Test7_1 extends Test7 {}
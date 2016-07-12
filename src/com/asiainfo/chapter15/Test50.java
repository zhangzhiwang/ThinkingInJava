package com.asiainfo.chapter15;

/**
 * Class的isInstance()方法
 * 
 * @author zhangzw8
 * @date 2016年7月12日 下午1:08:23
 */
public class Test50 {
	public static void main(String[] args) {
		/*判定指定的 Object 是否与此 Class 所表示的对象赋值兼容。此方法是 Java 语言 instanceof 运算符的动态等效方法。如果指定的 Object 参数非空，且能够在不引发 ClassCastException 的情况下被强制转换成该 Class 对象所表示的引用类型，则该方法返回 true；否则返回 false。 
		特别地，当该 Class 对象表示一个已声明的类时，若指定的 Object 参数是所表示类（或其任一子类）的一个实例，则此方法返回 true；否则返回 false。详见jdk 1.6*/

		Class<Test50> c = Test50.class;
		Test50_1 t = new Test50_1();
		System.out.println(c.isInstance(t));//isInstance()方法可以理解为：右边的对象是不是左边类型的一个实例
		System.out.println(c.isInstance(new Test50()));
		
		System.out.println(Test50_1.class.isInstance(new Test50_1()));
		System.out.println(Test50_1.class.isInstance(new Test50()));
		System.out.println("----------------------");
		
		//Class的isInstance()方法与关键字instanceof等效，只不过方向相反
		Test50 t2 = new Test50();
		System.out.println(t instanceof Test50);//instanceof表达的意思是：左边的对象是不是右边类型的一个实例
		System.out.println(t2 instanceof Test50_1);
		System.out.println(t2 instanceof Test50);
	}
}

class Test50_1 extends Test50 {}

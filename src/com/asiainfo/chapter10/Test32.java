package com.asiainfo.chapter10;

/**
 * 普通内部类不能有静态成员（变量和方法）和静态内部类（嵌套类）
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 下午4:49:51
 */
public class Test32 {
	class A {
//		public static int i = 1;// The field i cannot be declared static in a non-static inner type, unless initialized with a constant expression
//		public static void func1() {}// The method func1 cannot be declared static; static methods can only be declared in a static or top level type
		class B {}
		
//		static class C {}// The member type C cannot be declared static; static types can only be declared in static or top level types
	}
}

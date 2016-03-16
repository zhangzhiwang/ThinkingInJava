package com.asiainfo.chapter14;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * java反射机制的强大之处之三——反射可以访问匿名内部类的私有成员
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月16日 下午7:41:31
 */
public class Test41 {
	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Test33 t = V.get33();
		t.met1();
		t.met2();
		Method m3 = t.getClass().getDeclaredMethod("met3");
		m3.invoke(t);
		Method m4 = t.getClass().getDeclaredMethod("met4");
		m4.setAccessible(true);
		m4.invoke(t);
		Method m5 = t.getClass().getDeclaredMethod("met5");
		m5.invoke(t);
		Method m6 = t.getClass().getDeclaredMethod("met6");
		m6.invoke(t);
		System.out.println(t.getClass());
	}
}

class V {
	public static Test33 get33() {
		return new Test33() {
			@Override
			public void met1() {
				System.out.println("met1");
			}

			@Override
			public void met2() {
				System.out.println("met2");
			}

			public void met3() {
				System.out.println("met3");
			}

			private void met4() {
				System.out.println("met4");
			}

			void met5() {
				System.out.println("met5");
			}

			protected void met6() {
				System.out.println("met6");
			}
		};
	}
}
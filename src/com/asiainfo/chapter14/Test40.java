package com.asiainfo.chapter14;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * java反射机制的强大之处之二——反射可以访问私有内部类的私有方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月16日 下午7:26:04
 */
public class Test40 {
	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Test33 t33 = U.get33();
		t33.met1();
		t33.met2();
//		if (t33 instanceof U.UI) {// The type U.UI is not visible
//		}
		System.out.println(t33.getClass());
		Method m3 = t33.getClass().getDeclaredMethod("met3");
		m3.invoke(t33);
		Method m4 = t33.getClass().getDeclaredMethod("met4");
		m4.setAccessible(true);
		m4.invoke(t33);
	}
}

class U {
	private class UI implements Test33 {
		public void met1() {
			System.out.println("met1");
		}

		public void met2() {
			System.out.println("met2");
		}

		public void met3() {
			System.out.println("met3");
		}

		private void met4() {
			System.out.println("met4");
		}
	}

	public static Test33 get33() {
		return new U().new UI();
	}
}
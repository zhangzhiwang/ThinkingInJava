package com.asiainfo.chapter10;

/**
 * 匿名内部类使用外面传进来的参数
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月20日 下午3:08:22
 */
public class Test22 {
	public K getK(final Test22 t, final int i, boolean b) {// 只要是匿名内部类用到的参数，再定义参数列表时都要加上final
		return new K(b) {// K在Test20里面定义    b不是在匿名内部类里面用到而是传给了父类的构造器，所以该参数可以不为final
			private Test22 t1 = t;
			private int i1 = i;
		};
	}
}
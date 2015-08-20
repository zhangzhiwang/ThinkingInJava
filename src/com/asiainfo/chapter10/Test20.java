package com.asiainfo.chapter10;

/**
 * 匿名内部类使用外面传进来的参数
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月20日 下午2:50:26
 */
public class Test20 {
	public J getJ(final K k) {
		return new J() {
			private K k1 = k;// 如果匿名内部类里面用到了外围参数对象时，如果getJ()参数不加final，则编译不通过：Cannot
								// refer to the non-final local variable k
								// defined in an enclosing scope
		};
	}
}

class K {
	public K() {
	}

	public K(boolean b) {
	}
}

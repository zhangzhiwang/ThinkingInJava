package com.asiainfo.chapter8;

/**
 * 协变返回类型
 * 
 * @author zhangzhiwang
 * @date 2015年8月15日 下午4:18:12
 */
public class Test7 extends I {
	@Override
	public K func1() {
		return new K();
	}
}

class I {
	public J func1() {
		return new J();
	}
}

class J {

}

class K extends J {

}
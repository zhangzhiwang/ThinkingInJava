package com.asiainfo.chapter8;

/**
 * 纯继承——子类没有其特有的方法，复写了父类所有的方法，属于is-a
 * 
 * @author zhangzhiwang
 * @date 2015年8月15日 下午4:48:57
 */
public class Test9 extends O {// is-a
	@Override
	public void func1() {}
	
	@Override
	public void func2() {}
}

class O {
	public void func1() {}
	
	public void func2() {}
}

class P {
	public void func1() {}
}

class Q extends P {// is-like-a
	@Override
	public void func1() {}
	
	public void func2() {}
}
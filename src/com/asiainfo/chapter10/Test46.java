package com.asiainfo.chapter10;

/**
 * 外部类持有内部类的引用
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月26日 上午9:33:56
 */
public class Test46 {
	private A a;
	
	public Test46() {
		a = new A();// 此处省略this.
//		a = this.new A();
	}
	
	class A {}
}

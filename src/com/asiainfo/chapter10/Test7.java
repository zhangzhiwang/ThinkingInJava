package com.asiainfo.chapter10;

/**
 * 内部类的实例化
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月19日 下午4:55:18
 */
public class Test7 {
	public class Inner {}
	
	public void func1() {
		Inner i1 = new Inner();// 省略this
		Inner i2 = this.new Inner();
		
	}
}

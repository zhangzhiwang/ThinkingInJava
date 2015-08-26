package com.asiainfo.chapter10;

import com.asiainfo.chapter10.Test45.HH;

/**
 * 在外围类里可以直接初始化内部类——.new的省略形式
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月26日 上午9:21:10
 */
public class Test45 {
	class HH {
		public void func3() {}
	}
	
	public void func1() {
		HH hh1 = new HH();// 应该使用.new关键字，只不过这里省略了this.（默认加上.this），因为这里是在外部类里面实例化内部类
		HH hh2 = this.new HH();
	}
}

class GG {
	public void func2() {
//		HH hh3 = new HH();// 在其他类中实例化某类的内部类时必须将语法写全
		Test45 t = new Test45();
		HH hh3 = t.new HH();
	}
}
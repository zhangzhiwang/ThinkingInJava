package com.asiainfo.chapter10;

/**
 * Test25的完整形式
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 上午11:19:41
 */
public class Test27 {
	class J1 extends J {
		public void func2() {}
	}
	
	public void func3() {
		new J1().func2();
	}
}

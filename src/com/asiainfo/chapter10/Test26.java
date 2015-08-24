package com.asiainfo.chapter10;

/**
 * 多态调用子类特有的方法必须向下转型
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 上午11:17:54
 */
public class Test26 extends L {
	public static void main(String[] args) {
		L l = new Test26();
		l.func1();
		((Test26) l).func2();
	}

	public void func2() {
	}
}
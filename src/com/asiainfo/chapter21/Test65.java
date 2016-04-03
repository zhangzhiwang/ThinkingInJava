package com.asiainfo.chapter21;

/**
 * volatile和synchronized都可以在谁身上使用
 * 
 * @author Zhiwang Zhang
 * @date 2016年4月2日 下午5:43:51
 */
public class Test65 {
	private volatile int i = 1;
	private volatile String s = "";
	private volatile Test65 t;//volatile可以修饰域，包括基本类型和复合类型变量，但不能修是常量（final）
//	private synchronized int num;//Illegal modifier for the field num; only public, protected, private, static, final, transient & volatile are permitted   synchronized不能修饰域
	
//	public volatile void met1() {}//Illegal modifier for the method met1; only public, protected, private, abstract, static, final, synchronized, native & strictfp are permitted    volatile不能修饰方法
	public synchronized void met2() {}
	
//	synchronized {}volatile和synchronized都不能修饰代码块

//	volatile {}
}

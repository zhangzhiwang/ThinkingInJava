package com.asiainfo.chapter12;

/**
 * 对于重新抛出异常的情况要格外小心
 * 
 * @author zhangzw8
 * @date 2016年1月31日 上午11:20:55
 */
public class Test40 {
	public void func1() throws H, I {
		throw new H();
	}

	public void func2() {
		try {
			func1();
		} catch (H h) {
			System.out.println("这里代表特殊处理代码");
			throw new RuntimeException("hello");//重新抛出的异常直接抛给了上层方法，不会被下面的catch (Exception e)捕获到
		} catch (Exception e) {
			System.out.println("world");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Test40().func2();
	}
}

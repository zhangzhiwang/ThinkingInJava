package com.asiainfo.chapter12;

/**
 * 有关异常的一些过程
 *
 * @author Zhiwang Zhang
 * @date 2016年1月20日 下午9:57:38
 */
public class Test18 extends Exception {
	public Test18() {
	}

	public Test18(String msg) {
		super(msg);//向Throwable的一个成员变量detailMessage赋值
	}

	@Override
	public String getMessage() {
		return "123";
	}
	
	public static void main(String[] args) {
		try {
			throw new Test18();
		} catch (Test18 t) {
			t.printStackTrace();
		}

		try {
			throw new Test18("hello");
		} catch (Test18 t) {
			t.printStackTrace();//首先打印异常对象本身，打印时会调用Throwable的getMessage()方法，而该方法就是获取detailMessage的值，如果子类复写了getMessage()方法，则调用子类的getMessage()，这样就解释了运行结果
		}
	}
}

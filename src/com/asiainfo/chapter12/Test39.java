package com.asiainfo.chapter12;

/**
 * 要打消一个错误观念，即要么使用try/catch块捕获异常，要么throws出去，二者不要同时使用。这句话要分情况
 * 
 * @author zhangzw8
 * @date 2016年1月31日 上午11:04:59
 */
public class Test39 {
	public void func1() throws H, I {
	}

	public void func2() throws I {
		try {
			func1(); // 捕获其中一部分异常，抛出另一部分，这种情况是可以的
		} catch (H h) {
			h.printStackTrace();
		}
	}

	public void func3() throws Exception {
		try {
			func1();
		} catch (Exception e) {
			// 如果捕获到异常，进行特殊处理，比如关闭文件之类的，再将异常重新抛出，这种情况也是可以的
			throw e;
		}
	}

	public void func4() throws Exception {
		try {
			func1();
		} catch (Exception e) {
			throw e;// 捕获到异常后不做任何处理，就将异常抛出，这种情况就没必要了
		}
	}
}

package com.asiainfo.chapter12;

/**
 * 有关Exception的常用方法
 * 
 * @author zhangzw8
 * @date 2016年1月21日 下午12:45:15
 */
public class Test19 {
	public static void main(String[] args) {
		try {
			throw new Exception("hello world");
		} catch (Exception e) {
			System.out.println("getMessage():" + e.getMessage());
			System.out.println("getLocalizedMessage():" + e.getLocalizedMessage());// 创建此 throwable 的本地化描述。子类可以重写此方法，以便生成特定于语言环境的消息。对于不重写此方法的子类，默认实现返回与 getMessage() 相同的结果。
			System.out.println("toString():" + e);
			System.out.print("printStackTrace():");
			e.printStackTrace();
		}
	}
}
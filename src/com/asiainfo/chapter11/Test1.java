package com.asiainfo.chapter11;

import java.util.ArrayList;

/**
 * ArrayList
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年9月1日 上午9:27:38
 */
public class Test1 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();// ArrayList默认接收/取出Object类型
		list.add(new Test1());
		list.add(new A());

		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				System.out.println((Test1) list.get(i));// 默认调用Object的toString()方法，打印：类全名称@对象地址，其中地址为16进制数
			} else {
				System.out.println((A) list.get(i));
			}
		}
	}
}

class A {
}

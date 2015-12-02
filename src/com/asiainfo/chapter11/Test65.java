package com.asiainfo.chapter11;

import java.util.Map.Entry;

/**
 * 显示操作系统的环境变量
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月2日 下午12:54:25
 */
public class Test65 {
	public static void main(String[] args) {
		for (Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}
	}
}

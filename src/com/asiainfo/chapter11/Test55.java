package com.asiainfo.chapter11;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Queue窄化了LinkedList方法的反问权限
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月29日 上午11:36:44
 */
public class Test55 {
	public static void main(String[] args) {
		Queue queue = new LinkedList();//queue可以访问27个方法
		List list = new LinkedList();//list可以访问32个方法
	}
}

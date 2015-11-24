package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 在List和Set的构造器里面都可以传入一个Collection对其初始化
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月24日 下午1:26:03
 */
public class Test44 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(new HashSet<Integer>());
		Set<Integer> set = new HashSet<Integer>(new ArrayList<Integer>());
	}
}

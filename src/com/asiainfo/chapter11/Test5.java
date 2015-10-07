package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ArrayList的有参构造器之一——接收Collection的参数
 * 
 * @author zhangzhiwang
 * @date 2015年10月3日 下午3:56:52
 */
public class Test5 {
	public static void main(String[] args) {
		List list1 = new ArrayList(new ArrayList());
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));// Arrays.asList(1,2,3)作为外围ArrayList构造器的参数，用于初始化ArrayList，所以list2可以添加元素。对比Test4
		list2.add(4);

		for (Integer i : list2) {
			System.out.println(i);
		}
	}
}

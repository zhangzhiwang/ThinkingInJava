package com.asiainfo.chapter11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * List的其他一些方法
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月9日 下午1:22:55
 */
public class Test16 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 6, 5, 4);
		System.out.println(list);
		List<Integer> subList = list.subList(2, 6);
		System.out.println(subList);
		System.out.println(list.containsAll(subList));
		Collections.sort(subList);
		System.out.println(subList);
		System.out.println(list.containsAll(subList));
		System.out.println(list);
		Collections.shuffle(subList,new Random(123));
		System.out.println(subList);
		System.out.println(list);
		System.out.println(list.containsAll(subList));
 	}
}

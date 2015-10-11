package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 迭代器统一了对容器的访问方式
 * 
 * @author zhangzhiwang
 * @date 2015年10月11日 下午2:31:59
 */
public class Test26 {
	public static void main(String[] args) {
		List<Integer> par = Arrays.asList(1, 3, 2);
		List<Integer> list1 = new ArrayList<Integer>(par);
		List<Integer> list2 = new LinkedList<Integer>(par);

		Set<Integer> set1 = new HashSet<Integer>(par);//对元素的访问效率最高
		Set<Integer> set2 = new TreeSet<Integer>(par);//对元素进行升序排序
		Set<Integer> set3 = new LinkedHashSet<Integer>(par);//按照插入的顺序保存元素

		Map<String, String> param = new HashMap<String, String>();
		param.put("1", "apple");
		param.put("2", "orange");
		param.put("3", "nut");
		Map<String, String> map1 = new HashMap<String, String>(param);
		Map<String, String> map2 = new TreeMap<String, String>(param);
		Map<String, String> map3 = new LinkedHashMap<String, String>(param);// 顺序貌似不正确？

		Test26 test = new Test26();
		test.display(list1.iterator());
		test.display(list2.iterator());
		test.display(set1.iterator());
		test.display(set2.iterator());
		test.display(set3.iterator());
		test.display(map1.values().iterator());
		test.display(map2.values().iterator());
		test.display(map3.values().iterator());
	}

	public void display(Iterator it) {
		while (it.hasNext()) {
			Object i = it.next();
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}

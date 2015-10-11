package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 在用迭代器遍历容器的过程中对元素进行list.remove()是不允许的，但是可以用iterator.remove()对元素进行删除
 * 
 * @author zhangzhiwang
 * @date 2015年10月11日 下午1:59:41
 */
public class Test25 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		System.out.println(list);

		//		for (int i = 0; i < list.size(); i++) {
		//			System.out.println(list.get(i));
		//			list.remove(i);
		//		}

		//		for (Integer i : list) {//java.util.ConcurrentModificationException 为什么用foreach遍历就会抛异常呢？是因为foreach的底层实现是迭代器，具体可参考http://blog.csdn.net/a596620989/article/details/6930479
		//			list.remove(i);
		//		}

		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			//			list.remove(it.next());//java.util.ConcurrentModificationException
			it.next();
			it.remove();//用迭代器对元素进行移除之前，必须先调用next()，也就是说要想移除元素要先获取（用next()方法新近返回的元素）到这个元素。这是java API（1.6）对Iterator.remove()方法的描述：从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。每次调用 next 只能调用一次此方法。如果进行迭代时用调用此方法之外的其他方式修改了该迭代器所指向的 collection，则迭代器的行为是不确定的。
		}
		System.out.println(list);
	}
}

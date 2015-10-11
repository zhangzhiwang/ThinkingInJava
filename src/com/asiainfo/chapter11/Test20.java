package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * List的removeAll()方法
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月10日 上午8:18:06
 */
public class Test20 {
	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<Fruit>(Arrays.<Fruit> asList(new Fruit(1, "apple"), new Fruit(2, "orange"), new Fruit(3, "nut")));
		System.out.println(list);
		List<Fruit> sub = list.subList(1, 3);
		System.out.println(sub);
		list.removeAll(sub);// java.util.ConcurrentModificationException  可参考：http://www.cnblogs.com/dolphin0520/p/3933551.html
		System.out.println(list);
	}
}

package com.asiainfo.chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * 边界处的动作
 * 
 * @author zhangzw8
 * @date 2016年7月12日 下午12:43:31
 */
public class Test49<T> {
	
	public List<T> create(T t) {
		List<T> list = new ArrayList<T>();//T不是被擦除了吗？
		list.add(t);
//		list.add("");//The method add(t) in the type list<t> is not applicable for the arguments (string)
//		list.add(1);//The method add(int, T) in the type List<T> is not applicable for the arguments (int)
		return list;
	}
	
	public List create2(T t) {
		List list = new ArrayList();
		list.add(t);
		list.add("");
		list.add(1);
		return list;
	}
}

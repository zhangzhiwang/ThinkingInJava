package com.asiainfo.chapter15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 参数类型推断
 *
 * @author zhiwangzhang
 * @date 2016年7月3日 上午10:56:49
 */
public class Test26 {
	public static <T> List<T> getList() {
		return new ArrayList<T>();
	}
	
	public static <K, V> Map<K ,V> getMap() {
		return new HashMap<K, V>();
	}
	
	public static <T> int m(T t) {
		return 1;
	}
	
	public static void main(String[] args) {
		Test26.getList();//<Object> List<Object> com.asiainfo.chapter15.Test26.getList()   在泛型方法中，泛型参数是按照Object来对待的，无论是方法的入參还是方法返回值类型中的类型参数。在使用时，给泛型参数赋予什么类型就将Object向下转型为什么类型
		List<Integer> list = Test26.getList();
		List<String> list2 = Test26.getList();
		Map<String, Integer> map = Test26.getMap();
		Map<Integer, Double> map2 = Test26.getMap();
		Map<String, List<? extends Test26>> map3 = Test26.getMap();//编译器会推断出泛型参数的K的实际类型为String，V的实际类型为List
	}
}

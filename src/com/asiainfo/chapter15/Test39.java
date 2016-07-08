package com.asiainfo.chapter15;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * 证明HashSet类的所有方法都在Collection中
 * 
 * @author zhangzw8
 * @date 2016年7月7日 上午9:47:32
 */
public class Test39 {
	public static void addMethod(Set<String> subSet, Set<String> superSet) {
		Set<String> diffSet = Test35.different(subSet, superSet);
		Set<String> objSet = methodSet(Object.class);
		objSet.add("clone");//为什么要加上clone()方法，是因为Object的clone()方法是protected的，而HashSet的clone()方法是public的
		Set<String> retSet = Test35.different(diffSet, objSet);
		System.out.println(retSet);
	}
	
	public static <T> Set<String> methodSet(Class<T> cla) {
		Set<String> methodSet = new HashSet<String>();
		Method[] ms = cla.getMethods();
		for(Method m : ms) {
			methodSet.add(m.getName());
		}
		return methodSet;
	}
	
	public static void main(String[] args) {
		addMethod(methodSet(HashSet.class), methodSet(Collection.class));
	}
}

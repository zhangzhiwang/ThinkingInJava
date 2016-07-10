package com.asiainfo.chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 擦除
 *
 * @author zhiwangzhang
 * @date 2016年7月9日 下午4:05:54
 */
public class Test42<A> {
	public static void main(String[] args) {
		Class c1 = new ArrayList<Integer>().getClass();
		Class c2 = new ArrayList<String>().getClass();
		System.out.println(c1 == c2);
		
		getTypeParams(new ArrayList<Integer>());
		getTypeParams(new HashMap<Integer,String>());
		getTypeParams(new Test42<Boolean>());
	}
	
	public static void getTypeParams(Object o) {
		System.out.println(Arrays.toString(o.getClass().getTypeParameters()));
	}
}

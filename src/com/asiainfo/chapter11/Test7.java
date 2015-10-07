package com.asiainfo.chapter11;

import java.util.Arrays;
import java.util.List;

/**
 * 使用Arrays.asList()的注意事项
 * 
 * @author zhangzhiwang
 * @date 2015年10月3日 下午4:52:36
 */
public class Test7 {
	List<Test7> list1 = Arrays.asList(new Test7());
//	List<Test7> list2 = Arrays.asList(new C());// Type mismatch: cannot convert from List<C> to List<Test7>
	List<Test7> list3 = Arrays.<Test7>asList(new C());// 如果没有显示类型参数说明（见《Java变成思想》p221），Arrays.asList()的传入参数不能为范型的子类
	List<Test7> list4 = Arrays.<Test7>asList(new D());
}

class C extends Test7 {}

class D extends C {}
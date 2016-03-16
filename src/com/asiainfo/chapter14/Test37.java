package com.asiainfo.chapter14;

import com.asiainfo.chapter14.exercise.Test36;

/**
 * 测试包访问权限
 * 
 * @author zhangzw8
 * @date 2016年3月16日 下午1:24:15
 */
public class Test37 {
	public static void main(String[] args) {
		Test33 t33 = Test36.getT33();
		t33.met1();
		t33.met2();
//		t33.met3();//The method met3() is undefined for the type Test33
//		if (t33 instanceof S) {//S cannot be resolved to a type   S具有包访问权限，在exercise包外是不可见的
//			
//		}
	}
}

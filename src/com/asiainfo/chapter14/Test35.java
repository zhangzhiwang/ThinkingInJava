package com.asiainfo.chapter14;

import com.asiainfo.chapter14.exercise.Test34;

/**
 * 测试包访问权限
 * 
 * @author zhangzw8
 * @date 2016年3月16日 上午9:54:20
 */
public class Test35 {
	public static void main(String[] args) {
		Test33 t33 = new Test34();
		t33.met1();
		t33.met2();
//		t33.met3();//The method met3() is undefined for the type Test33
		if (t33 instanceof Test34) {
			Test34 t34 = (Test34) t33;
			t34.met3();
		}
	}
}

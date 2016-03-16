package com.asiainfo.chapter14.exercise;

import com.asiainfo.chapter14.Test33;

/**
 * 测试包访问权限（不要删除）
 * 
 * @author zhangzw8
 * @date 2016年3月16日 下午1:21:22
 */
public class Test36 {
	public static Test33 getT33() {
		return new S();
	}
}

class S implements Test33 {//将接口的实现类定为包访问权限，可以防止将接口的实现类公布出去之后带来的接口和实现类的耦合
	@Override
	public void met1() {
		System.out.println("S.met1()");
	}

	@Override
	public void met2() {
		System.out.println("S.met2()");
	}

	public void met4() {
		System.out.println("S.met4()");
	}
}
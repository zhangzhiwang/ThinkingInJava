package com.asiainfo.chapter14.exercise;

import com.asiainfo.chapter14.Test33;

/**
 * 测试包访问权限（不要删除）
 * 
 * @author zhangzw8
 * @date 2016年3月16日 上午9:50:42
 */
public class Test34 implements Test33 {
	@Override
	public void met1() {
		System.out.println(this.getClass() + " met1()");
	}

	@Override
	public void met2() {
		System.out.println(this.getClass() + " met2()");
	}

	public void met3() {
		System.out.println(this.getClass() + " met3()");//这样做本无可厚非——实现类除了可以实现接口的方法外还可以添加自己的方法，但这样涉及一个问题——实现类和接口的耦合性。
		//接口的作用之一就是将一些公共的部分抽象出来从而实现接口与其各实现类解耦，但是如果实现类添加自己独有的方法的话，那么在实现类里面就将接口和自己耦合起来了。
		//这样如果实现类也提供对外调用（或称发布出去），那么实现类的拥有者（比如**公司）也要像维护接口一样无为乎实现类，那么就加大了维护成本，微软就是一个例子，见p347注释
	}
}

package com.asiainfo.chapter10.exercise;

/**
 * p203练习21
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 下午5:34:18
 */
public class Exercise_21 implements Q {
	@Override
	public void func1() {
		System.out.println("Exercise_21.func1()");
	}
	
	public static void main(String[] args) {
		R.func2(new Exercise_21());
	}
}

interface Q {
	void func1();
	
	class R {
		public static void func2(Q q) {
			q.func1();
		}
	}
}
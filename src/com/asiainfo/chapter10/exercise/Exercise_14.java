package com.asiainfo.chapter10.exercise;

/**
 * p199练习14
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 下午2:38:03
 */
public class Exercise_14 {
	public void func5() {
		new DangerousMonster() {
			@Override
			public void func1() {
			}

			@Override
			public void func2() {
			}
		};
	}

	public Vampire func6() {
		return new Vampire() {
			@Override
			public void func4() {
			}

			@Override
			public void func2() {
			}

			@Override
			public void func1() {
			}

			@Override
			public void func3() {
			}
		};
	}
}

interface Monster {
	void func1();
}

interface DangerousMonster extends Monster {
	void func2();
}

interface Lethal {
	void func3();
}

interface Vampire extends DangerousMonster, Lethal {
	void func4();
}

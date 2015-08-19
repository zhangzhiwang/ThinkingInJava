package com.asiainfo.chapter9;

/**
 * 接口只能继承接口（不能继承其他类），但不可以实现接口
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月17日 下午2:12:44
 */
public interface Test8 {
	void func1();
}

//interface Car3 implements Test8{}// 接口不能实现其他接口

interface Car3 extends Test8 {// 接口可以继承其他接口，而且如果一个接口要继承的话，只能继承接口，而不能继承其他类（比如抽象类或普通类）
	@Override
	void func1();
	
	void func2();
}

abstract class AbCar4 {}

//interface Car5 extends AbCar4 {}// The type AbCar4 cannot be a superinterface of Car5; a superinterface must be an interface

class NormalClass {}

//interface Car5 extends NormalClass {}
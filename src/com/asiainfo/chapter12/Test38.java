package com.asiainfo.chapter12;

/**
 * 对与方法覆盖，为什么子类不能抛出比父类更多的异常
 * 
 * @author zhangzw8
 * @date 2016年1月30日 下午9:04:26
 */
public class Test38 extends Test38F {
	public static void main(String[] args) {
		//首先要知道一点：一个方法调用另一个方法，如果另一个方法声明抛出受检异常，那么这个方法必须声明抛出这些异常或者捕获它们
		Test38F tf = new Test38F();
		tf.func1();//调用func1的方法（这里是main()）不用声明或捕获任何异常
		//如果子类的方法抛出了比父类范围更大的异常，当向下转型的时候（多态），调用父类的func1方法而实际执行的是子类的func1方法，前面已经说了当调用父类的
		//func1方法的时候main()不用声明或捕获任何异常，而执行子类func1方法的时候可能抛出异常H，而此时main()没有做任何异常处理的准备（捕获或抛出）
		
	}
	
//	@Override
//	public void func1() throws H {}//子类的方法抛出了比父类范围更大的异常
}

class Test38F {
	public void func1() {}//假设父类方法不跑出任何异常
}
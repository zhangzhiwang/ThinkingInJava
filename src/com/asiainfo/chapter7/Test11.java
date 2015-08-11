package com.asiainfo.chapter7;

/**
 * is-a继承/has-a组合
 * @author zhangzhiwang
 * 2015年8月8日
 */
public class Test11 {

}

class Vehicle {}

class Car extends Vehicle{// is-a（是一个）的关系，汽车是一种交通工具，属于继承关系
	private Engine e;// has-a（有一个）的关系，汽车有引擎，属于组合关系
}

class Engine {}
package com.asiainfo.chapter21;

/**
 * 结合Test72可知，如果一个接口或抽象类的抽象方法，完全没有必要定义成同步的，要想使它同步，在实现类或子类里面同步即可。再者说语法不允许一个抽象方法被synchronized修饰
 * 
 * @author zhangzw8
 * @date 2016年4月3日 下午4:27:53
 */
public abstract class Test73 {
//	public abstract synchronized void met1();//抽象方法不能被synchronized修饰
}

interface Test73_1 {
//	synchronized void met1();//编译报错
}

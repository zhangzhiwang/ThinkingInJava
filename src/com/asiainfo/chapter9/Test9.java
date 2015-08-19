package com.asiainfo.chapter9;

/**
 * 抽象类的继承与实现
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月17日 下午2:23:19
 */
public abstract class Test9 {

}

abstract class Car6 extends Test9 {
}// 抽象类可以继承抽象类

class NorMalCar6 {
}

abstract class Car7 extends NorMalCar6 {
}// 抽象类也可以继承普通类

interface IntCar6 {
}

abstract class Car8 implements IntCar6 {
}// 抽象类可以实现接口
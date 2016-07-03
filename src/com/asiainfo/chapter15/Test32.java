package com.asiainfo.chapter15;

/**
 * 泛型类的使用
 *
 * @author zhiwangzhang
 * @date 2016年7月3日 下午3:49:52
 */
public class Test32<T> {

}

//class Test32_1 extends Test32<T>{}//T cannot be resolved to a type  为什么会报错？
//因为在继承Test32的时候或者说在这里定义Test32_1时声明了继承Test32，对于Test32来说属于使用该泛型类，在使用泛型类的时候要给泛型参数附上具体的类型，如Test32_2

class Test32_2 extends Test32<Integer>{}

//如果在使用时仍然不赋具体的类型，则必须在定义新类型时重新声明类型参数，如下面的Test32_3和Test32_4

class Test32_3<T> extends Test32<T>{}

class Test32_4<U> extends Test32<U>{}
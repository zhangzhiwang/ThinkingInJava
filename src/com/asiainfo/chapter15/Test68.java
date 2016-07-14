package com.asiainfo.chapter15;

/**
 * 子类的泛型边界不能是（或包括）父类的泛型边界的父类
 *
 * @author zhiwangzhang
 * @date 2016年7月14日 下午10:20:33
 */
public class Test68<T extends G1> {

}

class G {}

class G1 extends G {}

interface H {}

interface H1 extends H {}

class I implements H1 {}

//class Test68_1<T extends G> extends Test68<T> {}//子类的泛型边界不能是（或包括）父类的泛型边界的父类

//class Test68_1<T extends G & H> extends Test68<T>{}//子类的泛型边界不能是（或包括）父类的泛型边界的父类

class Test68_1<T extends I & H & H1> {}